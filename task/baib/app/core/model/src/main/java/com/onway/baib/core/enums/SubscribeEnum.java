/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.core.enums;

/**
 * ԤԼ����״̬
 * @author junjie.lin
 * @version $Id: SubscribeEnum.java, v 0.1 2016/9/12 15:17 junjie.lin Exp $
 */
public enum SubscribeEnum {

    INIT("init","δ����"),
    ACCEPT("accept","�ѽ���"),
    REJECT("reject","�Ѿܾ�"),
    CANCEL("cancel","��ȡ��"),
    FINISHED("finished","�����"),
    ;

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
    private SubscribeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     *
     * @param code         ö�ٱ��
     * @return
     */
    public static SubscribeEnum getSubscribeEnumByCode(String code) {
        for (SubscribeEnum param : values()) {
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
