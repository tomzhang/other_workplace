package com.onway.web.controller.cache;

import java.text.MessageFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import net.sf.cglib.beans.BeanCopier;

import org.apache.log4j.Logger;

import com.onway.baib.common.service.enums.BaibCoreResultCodeEnum;
import com.onway.baib.common.service.exception.BaibCoreException;
import com.onway.platform.common.utils.LogUtil;

/**
 * BeanCopier ���󿽱�������
 * 
 * @author wwf
 * @version $Id: BeanCopierCache.java, v 0.1 2016��9��9�� ����9:42:47 Administrator Exp $
 */
public class BeanCopierCache {

    /**
     * logger
     */
    protected static final Logger               logger           = Logger
                                                                     .getLogger(BeanCopierCache.class);

    /**
     *BeanCopier��������
     */
    public static final Map<String, BeanCopier> beanCopierVessel = new ConcurrentHashMap<String, BeanCopier>();

    /**
     * ��д��
     */
    private static ReentrantReadWriteLock       rw               = new ReentrantReadWriteLock();
    /**
     * ����
     */
    @SuppressWarnings("unused")
    private static Lock                         readLock         = rw.readLock();
    /**
     * д��
     */
    private static Lock                         writeLock        = rw.writeLock();

    /**
     * ��ȡ ���󿽱���
     *    Class<?> clazz
     * @param request
     * @param info
     * @return
     */
    public static BeanCopier get(Class<?> fromBean, Class<?> toBean,boolean useConverter) {
        String key = fromBean.toString() + toBean.toString();
        if (!beanCopierVessel.containsKey(key)) {
            writeLock.lock();
            try {
                if (!beanCopierVessel.containsKey(key)) {

                    BeanCopier bc = BeanCopier.create(fromBean, toBean, useConverter);
                    if (null == bc) {
                        LogUtil.error(logger, MessageFormat.format(
                            "ͨ����Դ�����Ŀ����󴴽�BeanCopier�쳣��fromBean:{0},toBean��{1}", new Object[] {
                                    fromBean.toString(), toBean.toString() }));
                        throw new BaibCoreException(BaibCoreResultCodeEnum.CREATE_BEANCOPIER_ERROR,
                            BaibCoreResultCodeEnum.CREATE_BEANCOPIER_ERROR.getMessage());
                    }
                    beanCopierVessel.put(key, bc);
                }
            } finally {
                writeLock.unlock();
            }
        }
        return beanCopierVessel.get(key);
    }
}
