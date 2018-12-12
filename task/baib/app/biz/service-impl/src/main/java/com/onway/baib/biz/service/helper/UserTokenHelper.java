package com.onway.baib.biz.service.helper;

import com.onway.baib.biz.service.query.SysConfigCacheService;
import com.onway.baib.core.exception.ParamErrorException;
import com.onway.baib.core.model.base.result.UserTokenResult;
import com.onway.cif.common.service.enums.AppTypeEnum;
import com.onway.common.lang.StringUtils;

/**
 * �û�token�ĸ�����
 * 
 * @author guangdong.li
 * @version $Id: UserTokenHelper.java, v 0.1 17 Feb 2016 15:02:17 guangdong.li Exp $
 */
public class UserTokenHelper {

    protected SysConfigCacheService sysConfigCacheService;

    /**
     * У���û�token��ȷ���û�ʹ���ֻ���Ψһ�� ,ǿ�ư汾���� 
     * 
     * @param userId �û�ID
     * @param token APP Token
     * @return ���JSON
     */
    public UserTokenResult token(String userId, String token, String appType, String version) {
        UserTokenResult result = new UserTokenResult();
        result.setSuccess(true);
        /* if (StringUtils.isBlank(version)) {
             // ������ΪAndroid�ͻ���ȡ�����汾�Ŷ������޷����ظ���¼�ж�  add by guangdong.li 
             version = "1.0.4.2";
         }*/
        if (StringUtils.equals(appType, AppTypeEnum.PC.code())) {
            return result;
        }

        /*  if (StringUtils.equals(appType, AppTypeEnum.IOS.code())) {
              if ((compareVersion(version, "2.12.0") < 0)) {
                  result.setMessage("�����������°汾��");
                  result.setSuccess(false);
                  return result;
              }
          }
          if (StringUtils.equals(appType, AppTypeEnum.ANDROID.code())) {
              if ((compareVersion(version, "4.2.5.0") < 0)) {
                  result.setMessage("�����������°汾��");
                  result.setSuccess(false);
                  return result;
              }
          }
        */
        /*  int versionInt = Integer.parseInt(StringUtils.replace(version, ".", ""));
          if (StringUtils.equals(appType, AppTypeEnum.IOS.code()) && versionInt <= 120) {
              return result;
          }
          if (StringUtils.equals(appType, AppTypeEnum.ANDROID.code()) && versionInt <= 1024) {
              return result;
          }
        */
        /* QueryResult<CifUserToken> queryUserToken = userAppInfoServiceClient
             .getCifUserTokenByUserId(userId);*/

        /*if (queryUserToken == null) {
            result.setSuccess(false);
            result.setMessage("�˻���¼��ʱ�������µ�¼");
            return result;
        }*/
        /*
          if (StringUtils.isEmpty(queryUserToken.getResultObject().getTokenLogin())) {
              result.setSuccess(false);
              result.setMessage("���ͨ�����������ֻ������µ�¼");
              return result;
          }*/

        /*  if (!StringUtils.equals(
              StringUtils.defaultString(queryUserToken.getResultObject().getTokenLogin()).replaceAll(
                  "\n", ""), StringUtils.defaultString(token).replaceAll("\n", ""))) {
              result.setSuccess(false);
              result.setMessage("�˺����������豸�ϵ�¼��Ϊ���˺Ű�ȫ�������µ�¼");
              return result;
          }
          result.setEncrpKey(queryUserToken.getResultObject().getEncrpKey());*/
        return result;
    }

    /**
     * �Ƚϰ汾�ߵͣ�version1 &lt; version2 ����-1 �����ڷ���0�����ڷ���1
     * 
     * @param version1 �汾1
     * @param version2 �汾2
     * @return  version1 &lt; version2 ����-1 �����ڷ���0�����ڷ���1
     * @throws ParamErrorException �汾��ʽ����ȷ
     */
    public static int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null) {
            throw new ParamErrorException("�汾�Ÿ�ʽ����");
        }
        String[] versionArray1 = version1.split("\\.");
        String[] versionArray2 = version2.split("\\.");
        int idx = 0;
        int minLength = Math.min(versionArray1.length, versionArray2.length);//ȡ��С����ֵ  
        int diff = 0;
        while (idx < minLength
               && (diff = versionArray1[idx].length() - versionArray2[idx].length()) == 0//�ȱȽϳ���  
               && (diff = versionArray1[idx].compareTo(versionArray2[idx])) == 0) {//�ٱȽ��ַ�  
            ++idx;
        }
        //����Ѿ��ֳ���С����ֱ�ӷ��أ����δ�ֳ���С�����ٱȽ�λ�������Ӱ汾��Ϊ��  
        diff = (diff != 0) ? diff : versionArray1.length - versionArray2.length;
        return diff;
    }

}
