package com.onway.baib.core.enums;

/**
 * onway.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */

import org.apache.commons.lang.StringUtils;

/**
 * ͨ��״̬ö��
 * 
 * @author li.hong
 * @version $Id: CommonEnum.java, v 0.1 2016��9��1�� ����3:26:26 li.hong Exp $
 */
public enum CommonEnum {

    _0("0", "false"),

    _1("1", "true"), ;

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
    private CommonEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static CommonEnum getCommonStatusByCode(String code) {
        for (CommonEnum param : values()) {
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

}
