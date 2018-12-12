package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;


/**
 * ��������״̬ö���� 
 * @author wenqiang.Wang
 * @version $Id: OrderManageTypeEnum.java, v 0.1 2017��2��7�� ����11:46:23 wenqiang.Wang Exp $
 */
public enum OrderManageTypeEnum {

    ALLORDER("0", "ȫ������"),

    UNPAYMENT("1", "δ����"),

    WAIT_USER("2", "���ó�"),

    TURN_OUT_ING("3", "�ó���"),

    FINISH("4", "�����"),;

    private String code;

    private String message;

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static OrderManageTypeEnum getOrderTypeEnumByCode(String code) {
        for (OrderManageTypeEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }

    private OrderManageTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
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
