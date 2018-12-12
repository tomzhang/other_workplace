package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;

/**
 * ����״̬ö����
 * 
 * @author jiaming.zhu
 * @version $Id: OrderTypeEnum.java, v 0.1 2017��1��22�� ����6:43:23 ZJM Exp $
 */
public enum OrderTypeEnum {

    INIT("0", "��ʼ��", "", ""),

    DOWNPAYMENT("1", "����", "", ""),

    CONFIRM("2", "����ȷ��", "", ""),

    FEED_BACK("3", "�ѷ���", "", ""),

    WAIT_TURN_OUT("4", "������", "", ""),

    TURN_OUT_SIGN("5", "������ǩ��", "��������", "1"),

    TURN_OUT_DETECTION("6", "�����⳵", "�⳵ǩ��", "2"),

    TURN_OUT_ALEARDY_DETECTION("7", "�����Ѳ⳵", "", "3"),

    PAY_MENT("8", "�Ѹ���", "", ""),

    TURN_OUT_ING("9", "������", "��ʼ����", "4"),

    SELF_END("10", "��������", "��������", "5"),

    OVER_ORDER("11", "��������", "��������", "6"),

    FINISH("12", "�����", "", ""),

    BACK_DETECTION("13", "�����⳵", "�⳵ǩ��", "7"),

    BACK_ALEARDY_DETECTION("14", "�����Ѳ⳵", "", ""),

    BACK_SIGN("15", "����ǩ��", "", ""),

    RETURN_CAR("16", "���", "�������", "8"),

    SETTLE("17", "�ѽ���", "", ""), ;

    private String code;

    private String message;

    private String usingType;

    private String driverOrderType;

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static OrderTypeEnum getOrderTypeEnumByCode(String code) {
        for (OrderTypeEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }

    /**
     * ͨ��ö��<driverOrderType>driverOrderType</driverOrderType>���ö�١�
     * 
     * @param driverOrderType         ö�ٱ��
     * @return
     */
    public static OrderTypeEnum getOrderTypeEnumBydriverOrderType(String driverOrderType) {
        for (OrderTypeEnum param : values()) {
            if (StringUtils.equals(param.getDriverOrderType(), driverOrderType)) {
                return param;
            }
        }
        return null;
    }

    private OrderTypeEnum(String code, String message, String usingType, String driverOrderType) {
        this.code = code;
        this.message = message;
        this.usingType = usingType;
        this.driverOrderType = driverOrderType;
    }

    public String getUsingType() {
        return usingType;
    }

    public void setUsingType(String usingType) {
        this.usingType = usingType;
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

    public String getDriverOrderType() {
        return driverOrderType;
    }

    public void setDriverOrderType(String driverOrderType) {
        this.driverOrderType = driverOrderType;
    }

}
