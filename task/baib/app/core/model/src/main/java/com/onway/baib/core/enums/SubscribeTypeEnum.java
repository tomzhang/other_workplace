package com.onway.baib.core.enums;

import com.onway.common.lang.StringUtils;

/**
 * ԤԼ����ö��
 * 
 * @author jiaming.zhu
 * @version $Id: SubscribeTypeEnum.java, v 0.1 2016��9��13�� ����3:28:48 zjm Exp $
 */
public enum SubscribeTypeEnum {

    WX("WX", "ά��"),

    GZ("GZ", "��װ"), ;

    /**ö�ٱ���**/
    private String code;

    /**ö������**/
    private String message;

    /**
     * ���캯��
     * @param code
     * @param message
     */
    private SubscribeTypeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * ͨ��ö�ٱ����ȡö��
     * 
     * @param code
     * @return
     */
    public static SubscribeTypeEnum getSubscribeTypeEnumByCode(String code) {
        for (SubscribeTypeEnum param : values()) {

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
