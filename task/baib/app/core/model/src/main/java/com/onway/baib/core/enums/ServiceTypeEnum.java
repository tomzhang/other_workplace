/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.core.enums;

/**
 * @author senze.liu
 * @version $Id: ServiceTypeEnum.java, v 0.1 2016/9/9 15:44 senze.liu Exp $
 */
public enum ServiceTypeEnum {

    WX("WX", "ά��"),
    MR("MR", "����"),
    GZ("GZ", "��װ"),
    XC("XC", "ϴ��"),
    BY("BY", "����"),
    BY_1("BY_1", "�������ͣ�����"),
    BY_2("BY_2", "��������������"),
    BY_3("BY_3", "����ȼ�������������ã�"),
    BY_4("BY_4", "�����յ�������"),
    BY_5("BY_5", "�����յ������"),
    BY_6("BY_6", "����ɲ����"),
    BY_7("BY_7", "����PM2.5��о"),
    BY_8("BY_8", "�������ڲ���ϴ"),;

    /** ö�ٱ�� */
    private String code;

    /** ö������ */
    private String message;

    /**
     * ���췽��
     *
     * @param code         ö�ٱ��
     * @param message      ö������
     */
    private ServiceTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     *
     * @param code         ö�ٱ��
     * @return
     */
    public static ServiceTypeEnum getServiceTypeEnumByCode(String code) {
        for (ServiceTypeEnum param : values()) {
            if (org.apache.commons.lang.StringUtils.equals(param.getCode(), code)) {
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
}
