/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.biz.service.helper;

import com.onway.baib.core.model.base.result.UserTokenResult;



/**
 * ��ȫ��Ϣ�������
 * 
 * @author guangdong.li
 * @version $Id: SecurityInfoHelper.java, v 0.1 23 Feb 2016 15:17:41 guangdong.li Exp $
 */
public interface SecurityInfoHelper {

    /**
     * ���֧�������Ƿ���ȷ
     * 
     * @param userId
     * @param payPassword
     * @param version
     * @param appType
     * @param encodeType
     * @param tokenResult
     * @return
     */
    public boolean checkPayPwd(String userId, String payPassword);

    /**
     * ���֧�������Ƿ���ȷ
     * 
     * @param userId
     * @param payPassword
     * @param version
     * @param appType
     * @param encodeType
     * @param tokenResult
     * @return
     */
    public boolean checkPayPassword(String userId, String payPassword, String version,
                                    String appType, UserTokenResult tokenResult);

    /**
     * �������п�
     * 
     * @param userId
     * @param bankAccount
     * @param appType
     * @param tokenResult
     * @return
     */
    public String decryStr(String userId, String bankAccount, String appType,
                           UserTokenResult tokenResult);
}
