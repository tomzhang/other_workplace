/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.core.enums;

/**
 * @author senze.liu
 * @version $Id: ServiceTypeEnum.java, v 0.1 2016/9/9 15:44 senze.liu Exp $
 */
public enum ServiceRecTypeEnum {

    WX_REC_FLAG("WX_REC_FLAG", "ά���Ƽ���ʶ"),
    MR_REC_FLAG("MR_REC_FLAG", "�����Ƽ���ʶ"),
    GZ_REC_FLAG("GZ_REC_FLAG", "��װ�Ƽ���ʶ"),
    BY_REC_FLAG("BY_REC_FLAG", "�����Ƽ���ʶ"),;

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
    private ServiceRecTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     *
     * @param code         ö�ٱ��
     * @return
     */
    public static ServiceRecTypeEnum getServiceTypeEnumByCode(String code) {
        for (ServiceRecTypeEnum param : values()) {
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
