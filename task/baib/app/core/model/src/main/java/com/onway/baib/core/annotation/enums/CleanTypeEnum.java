package com.onway.baib.core.annotation.enums;

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
public enum CleanTypeEnum {

    MPX("0", "�˹���ϴ"),
    MJX("1", "�˹���ϴ"),
    CJX("2", "������ϴ"),;

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
    private CleanTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static CleanTypeEnum getChannelEnumByCode(String code) {
        for (CleanTypeEnum param : values()) {
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
