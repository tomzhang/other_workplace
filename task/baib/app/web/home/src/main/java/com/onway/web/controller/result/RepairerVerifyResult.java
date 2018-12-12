/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.web.controller.result;


/**
 * �û�ʵ��״̬�����
 * 
 * @author guangdong.li
 * @version $Id: UserRealNameStateResult.java, v 0.1 24 Feb 2016 13:45:17 guangdong.li Exp $
 */
public class RepairerVerifyResult extends JsonResult {

    public RepairerVerifyResult(boolean bizSucc, String errCode, String message) {
        super(bizSucc, errCode, message);
    }

    private static final long serialVersionUID = 952688792211870628L;

    /** �û��Ƿ���ʵ����ʶ */
    private boolean           flag             = false;
    
    //֤������
    private String certNo;
    
    //��֤����
    private String realName;
    
    /** ���֤ͼƬ��ַ*/
    private String idbaibdAttchUrl;
    
    /** ��ʦ����ͼƬ��ַ*/
    private String  repairerCertificateAttchUrl;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdbaibdAttchUrl() {
        return idbaibdAttchUrl;
    }

    public void setIdbaibdAttchUrl(String idbaibdAttchUrl) {
        this.idbaibdAttchUrl = idbaibdAttchUrl;
    }

    public String getRepairerCertificateAttchUrl() {
        return repairerCertificateAttchUrl;
    }

    public void setRepairerCertificateAttchUrl(String repairerCertificateAttchUrl) {
        this.repairerCertificateAttchUrl = repairerCertificateAttchUrl;
    }
}
