package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;


/**
 * ��Ʒ����ö��
 * @author wenqiang.Wang
 * @version $Id: ProductTypeEnum.java, v 0.1 2017��2��7�� ����3:30:24 wenqiang.Wang Exp $
 */
public enum ProductTypeEnum {

    WEDDINGCAR("0", "�鳵"),

    VEHICLEPACKAGE("1", "�ײ�"),

    BUSINESS("2", "�����ó�"),;

    private String code;

    private String message;

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static ProductTypeEnum getOrderTypeEnumByCode(String code) {
        for (ProductTypeEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }

    private ProductTypeEnum(String code, String message) {
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
