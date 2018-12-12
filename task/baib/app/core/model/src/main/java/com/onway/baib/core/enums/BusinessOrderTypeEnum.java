package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;

/**
 * �û�����ö����
 * 
 * @author jiaming.zhu
 * @version $Id: UserTypeEnum.java, v 0.1 2017��1��22�� ����11:31:44 ZJM Exp $
 */
public enum BusinessOrderTypeEnum {

    ALL("0", "ȫ��"),

    WAIT_OUT("1", "������"),

    OUTING("2", "������"),

    FINISH("3", "�����"),

    ;

    private String code;

    private String message;

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static BusinessOrderTypeEnum getBusinessOrderTypeEnumByCode(String code) {
        for (BusinessOrderTypeEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }

    private BusinessOrderTypeEnum(String code, String message) {
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
