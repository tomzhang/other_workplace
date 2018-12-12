/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;

/**
 * ��Աע���豸����
 * 
 * @author guangdong.li
 * @version $Id: RegisterFromTypeEnum.java, v 0.1 2014-11-19 ����8:10:41 guangdong.li Exp $
 */
public enum RegisterFromTypeEnum {

    /** PC�� */
    PC("PC", "�ٷ���վ", 1),

    /** ��׿�ͻ��� */
    ANDROID("APP_AND", "��׿�ͻ���", 2),

    /** ƻ���ͻ��� */
    IOS("APP_IOS", "ƻ���ͻ���", 3),

    /** WP�ͻ���*/
    WINDOW_PHONE("WP", "Windows Phone�ͻ���", 4),

    /** ����ע�� */
    QUICK("QUICK", "����ע��", 5),
    
    /** �������� */
    INVITE("INVITE", "��������", 6),

    /** δ֪���� */
    UNKNOW("UNKNOW", "δ֪����", 0);

    /** ö�ٱ�� */
    private String code;

    /** ö������ */
    private String message;

    /** ö�ٱ�� */
    private int    value;

    /**
     * ���췽��
     * 
     * @param code         ö�ٱ��
     * @param message      ö������
     */
    private RegisterFromTypeEnum(String code, String message, int value) {
        this.code = code;
        this.message = message;
        this.value = value;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static RegisterFromTypeEnum getFromTypeByCode(String code) {
        for (RegisterFromTypeEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return UNKNOW;
    }

    /**
     * ͨ��ö��<code>name</code>���ö�١�
     * 
     * @param name         ö������
     * @return
     */
    public static RegisterFromTypeEnum getFromTypeByName(String name) {
        for (RegisterFromTypeEnum param : values()) {
            if (StringUtils.equals(param.name(), name)) {
                return param;
            }
        }
        return UNKNOW;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
