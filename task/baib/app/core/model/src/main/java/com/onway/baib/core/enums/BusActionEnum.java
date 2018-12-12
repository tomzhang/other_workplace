package com.onway.baib.core.enums;

/**
 * ҵ������
 * 
 * @author guangdong.li
 * @version $Id: BusActionEnum.java, v 0.1 14 Jan 2016 16:47:52 guangdong.li Exp $
 */
public enum BusActionEnum {

    /** ��ǰҳ�� */
    CURRENT_PAGE("CURRENT_PAGE", "0"),

    /** (�깺����أ���ֵ������)��������ҳ�� */
    INIT_ORDER("INIT_ORDER", "1"),

    /** ʵ��ҳ�� */
    REALNAME_IDENTIFY("REALNAME_IDENTIFY", "2"),

    /** ��Ȩ/��Ȩ  */
    AUTHENTICATION("AUTHENTICATION", "3"),

    /** ��ȫ�û���Ϣ */
    SUPPLY_ADDRESS("SUPPLY_ADDRESS", "4"),

    /** �� */
    BIND_CARD("BIND_CARD", "5"),

    /** �������� */
    SET_PSW("SET_PSW", "6"),

    /** ����̨ȷ��ҳ */
    CASHIER("CASHIER", "7"),

    /** �����ɹ�ҳ */
    ORDER_FINISH("ORDER_FINISH", "8"),

    /** ���֧��ҳ */
    QUICK_PAY("QUICK_PAY", "9"), ;
    ;

    private String action;

    private String code;

    /**
     * @param action
     * @param renderDes
     * @param code
     */
    private BusActionEnum(String action, String code) {
        this.action = action;
        this.code = code;
    }

    /**
     * Getter method for property <tt>action</tt>.
     * 
     * @return property value of action
     */
    public String getAction() {
        return action;
    }

    /**
     * Setter method for property <tt>action</tt>.
     * 
     * @param action value to be assigned to property action
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
