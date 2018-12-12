package com.onway.baib.core.enums;

/**
 * onway.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */

import org.apache.commons.lang.StringUtils;

/**
 * �ն�ö����
 * 
 * @author li.hong
 * @version $Id: TerminalTypeEnum.java, v 0.1 2016��9��1�� ����3:23:03 li.hong Exp $
 */
public enum PaymentStageEnum {

    EARNESTMONEY("PAYEARNESTMONEY","1", "������"),
    
    RETAINAGE("RETAINAGE","2", "��β��"),
    
    OVERRUNCOST("OVERRUNCOST","3", "���������"),;

    /** ö�ٱ�� */
    private String code;
    
    /**ö��ֵ**/
    private String value;

    /** ö������ */
    private String message;

    /**
     * ���췽��
     *
     * @param code         ö�ٱ��
     * @param message      ö������
     */
    private PaymentStageEnum(String code, String value,String message) {
        this.code = code;
        this.setValue(value);
        this.message = message;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static PaymentStageEnum getChannelEnumByCode(String code) {
        for (PaymentStageEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
