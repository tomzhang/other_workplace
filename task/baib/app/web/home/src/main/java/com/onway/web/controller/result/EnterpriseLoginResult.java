/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.web.controller.result;



/**
 * �ͻ��˵�¼�����
 * 
 * @author guangdong.li
 * @version $Id: EmpLoginResult.java, v 0.1 2016��4��11�� ����10:28:00 guangdong.li Exp $
 */
public class EnterpriseLoginResult extends JsonResult {

    /**  */
    private static final long   serialVersionUID = 1L;

    /** ��ҵ����*/
    private String              enterpriseName;

    /** ��ҵ�û�id*/
    private String              enterpriseId;
   
    /**��ҵ����  **/
    private String              enterpriseType;
    
    /**��ҵ�û��ƹ��ά��**/
    private String               qRCode;
    
    /**��½�˺ţ����ֻ��ţ�   **/
    private String             loginName;
    

    /**
     * @param bizSucc
     * @param errCode
     * @param message
     */
    public EnterpriseLoginResult(boolean bizSucc, String errCode, String message) {
        super(bizSucc, errCode, message);
    }


    public String getEnterpriseName() {
        return enterpriseName;
    }


    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }


    public String getEnterpriseId() {
        return enterpriseId;
    }


    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }


    public String getEnterpriseType() {
        return enterpriseType;
    }


    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }


    public String getLoginName() {
        return loginName;
    }


    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    public String getqRCode() {
        return qRCode;
    }


    public void setqRCode(String qRCode) {
        this.qRCode = qRCode;
    }

}
