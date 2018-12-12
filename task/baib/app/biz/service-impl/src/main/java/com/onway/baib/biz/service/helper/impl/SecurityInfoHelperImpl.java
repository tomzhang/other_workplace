/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.biz.service.helper.impl;

import java.text.MessageFormat;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.onway.baib.biz.service.helper.SecurityInfoHelper;
import com.onway.baib.common.util.Des3;
import com.onway.baib.core.model.base.result.UserTokenResult;
import com.onway.cif.common.service.enums.AppTypeEnum;
import com.onway.common.lang.StringUtils;
import com.onway.platform.common.security.AesCryptoHelper;

/**
 * 
 * @author guangdong.li
 * @version $Id: SecurityInfoHelperImpl.java, v 0.1 23 Feb 2016 15:19:32 guangdong.li Exp $
 */
public class SecurityInfoHelperImpl implements SecurityInfoHelper {

    /** logger */
    private static final Logger logger = Logger.getLogger(SecurityInfoHelperImpl.class);


    /** 
     * @see com.onway.front.biz.service.helper.SecurityInfoHelper#checkPayPassword(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.onway.front.core.model.base.result.UserTokenResult)
     */
  

    @Override
    public boolean checkPayPassword(String userId, String payPassword, String version,
                                    String appType, UserTokenResult tokenResult) {
        try {
            /** aes���� δ���ý������봦��������������� */
            String sourcePayPwd = payPassword;

            /*QueryResult<UserInfo> cifUser = userInfoQueryServiceClient.queryByUserId(userId);

            if (StringUtils.equals(cifUser.getResultObject().getPayPwd(), sourcePayPwd)
                || StringUtils.equals(cifUser.getResultObject().getPayPwd(),
                    Md5Encrypt.toMD5High(sourcePayPwd))) {
                return true;
            }*/

            /*  
              *//** IOSȡ�����뷽ʽ */
            /*
            if (StringUtils.equals(appType, AppTypeEnum.IOS.code())
            || StringUtils.equals(appType, AppTypeEnum.PC.code())) {
            sourcePayPwd = AesCryptoHelper.decryptBase64(AesCryptoHelper.SEED, payPassword);
            if (StringUtils.equals(cifUser.getResultObject().getPayPwd(), sourcePayPwd)
            || StringUtils.equals(cifUser.getResultObject().getPayPwd(),
            Md5Encrypt.toMD5High(sourcePayPwd))) {
            return true;
            }
            return false;
            } else {
            *//** andorid�������汾ȡ�����뷽ʽ */
            /*
            sourcePayPwd = AesCryptoHelper.decryptBase64RawKey(tokenResult.getEncrpKey(),
            payPassword);
            *//** У������ */
            /*
            if (StringUtils.equals(cifUser.getResultObject().getPayPwd(), sourcePayPwd)
            || StringUtils.equals(cifUser.getResultObject().getPayPwd(),
            Md5Encrypt.toMD5High(sourcePayPwd))) {
            return true;
            }
            return false;
            }*/
        } catch (Exception e) {
            logger.error(MessageFormat.format("[userId={0}]����У�����", new Object[] { userId }), e);
        }
        return false;
    }

    /** 
     * @see com.onway.front.biz.service.helper.SecurityInfoHelper#decryStr(java.lang.String, java.lang.String, java.lang.String, com.onway.front.core.model.base.result.UserTokenResult)
     */
    @Override
    public String decryStr(String userId, String decryStr, String appType,
                           UserTokenResult tokenResult) {
        try {
            String str = "";
            /** IOSȡ�����뷽ʽ */
            if (StringUtils.equals(appType, AppTypeEnum.IOS.code())
                || StringUtils.equals(appType, AppTypeEnum.PC.code())) {
                str = AesCryptoHelper.decryptBase64(AesCryptoHelper.SEED, decryStr);
            } else {
                /** andorid�������汾ȡ�����뷽ʽ */
                str = AesCryptoHelper.decryptBase64RawKey(tokenResult.getEncrpKey(), decryStr);
            }
            if (StringUtils.isBlank(str)) {
                logger.error(MessageFormat.format(
                    "�ַ������ܳ�Ϊ�մ� �����ܴ�Ϊ:{0},appType:{1}, android encrpkey:{2}", new Object[] {
                            decryStr, appType, tokenResult.getEncrpKey() }));
            }
            return str;
        } catch (Exception e) {
            logger.error(MessageFormat.format("[userId={0}]���п����ܳ���", new Object[] { userId }), e);
        }
        return "";
    }

    @Override
    public boolean checkPayPwd(String userId, String payPassword) {
        return false;
    }

}
