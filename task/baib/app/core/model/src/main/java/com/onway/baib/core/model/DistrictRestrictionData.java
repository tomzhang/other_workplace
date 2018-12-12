/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.core.model;

import java.io.Serializable;

/**
 * ���п���ʡ���С�֧�е�������Ϣ
 */
public class DistrictRestrictionData implements Serializable {

    private static final long serialVersionUID = -8505593275367809567L;

    //���б���
    private String            bankCode;

    //����ͼ���ַ
    private String            bankIconUrl;

    //��������
    private String            bankName;

    //�Ƿ���ʾʡ�ݱ�ʶ
    private String            needProvince;

    //�Ƿ���ʾ���б�ʶ
    private String            needCity;

    //�Ƿ���ʾ֧�б�ʶ
    private String            needSubBank;

    // ��ʾ��Ϣ
    private String            tipMsg;

    public String getTipMsg() {
        return tipMsg;
    }

    public void setTipMsg(String tipMsg) {
        this.tipMsg = tipMsg;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankIconUrl() {
        return bankIconUrl;
    }

    public void setBankIconUrl(String bankIconUrl) {
        this.bankIconUrl = bankIconUrl;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getNeedProvince() {
        return needProvince;
    }

    public void setNeedProvince(String needProvince) {
        this.needProvince = needProvince;
    }

    public String getNeedCity() {
        return needCity;
    }

    public void setNeedCity(String needCity) {
        this.needCity = needCity;
    }

    public String getNeedSubBank() {
        return needSubBank;
    }

    public void setNeedSubBank(String needSubBank) {
        this.needSubBank = needSubBank;
    }

}
