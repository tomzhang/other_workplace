package com.onway.baib.common.service.enums;

/**
 * onway.com Inc.
 * Copyright (c) 2013-2013 All Rights Reserved.
 */

import com.onway.platform.common.enums.EnumBase;

/**
 * ϵͳ������
 * 
 * @author li.hong
 * @version $Id: baibCoreResultCodeEnum.java, v 0.1 2016��9��2�� ����6:00:33 li.hong Exp $
 */
public enum BaibCoreResultCodeEnum implements EnumBase {

    CREATE_BEANCOPIER_ERROR("CREATE_BEANCOPIER_ERROR", "����BeanCopier�쳣"),

    FILE_UPLOAD_ERROR("FILE_UPLOAD_ERROR", "�ļ��ϴ��쳣"),

    FORCE_LOG_OUT("FORCE_LOG_OUT", "�˺����������豸�ϵ�¼��Ϊ���˺Ű�ȫ�������µ�¼"),

    ERROR_CHECK_CODE("ERROR_CHECK_CODE", "��֤������������������룡"),

    NOT_EQUAL_LOGIN_PASSWD("NOT_EQUAL_LOGIN_PASSWD", "��������������벻���������������"),

    ERROR_LOGIN_PWD("ERROR_LOGIN_PWD", "��¼���벻��ȷ������������"),

    INVALID_REQUEST("INVALID_REQUEST", "�Ƿ�����"),

    USER_NOT_EXSIT("USER_NOT_EXSIT", "ϵͳ�����ڴ��û�"),

    USERID_NOT_BLANK("USERID_NOT_BLANK", "�û��Ų���ȷ"),

    TOKEN_NOT_BLANK("TOKEN_NOT_BLANK", "token����ȷ"),

    /** �����ɹ� */
    REGISTER_FAIL("REGISTER_FAIL", "ע��ʧ��"),


    /** �����ɹ� */
    SUCCESS("SUCCESS", "�����ɹ�"),

    /** ����ʧ�� */
    SAVE_FAILURE("SAVE_FAILURE", "����ʧ��"),

    /** ͼƬΪ�� */
    IMAGE_IS_NULL("IMAGE_IS_NULL", "ͼƬΪ��"),
    
    /** ͼƬ��ʽ�쳣*/
    IMAGE_FORMMAT_ERROR("IMAGE_FORMMAT_ERROR", "ͼƬ��ʽ�쳣"),

    /** ϵͳ�쳣*/
    SYSTEM_ERROR("SYSTEM_ERROR", "ϵͳ�쳣������ϵ����Ա��"),

    /** �ⲿ�ӿڵ����쳣*/
    INTERFACE_SYSTEM_ERROR("INTERFACE_SYSTEM_ERROR", "�ⲿ�ӿڵ����쳣������ϵ����Ա��"),

    /** ҵ�����Ӵ���ʱ */
    CONNECT_TIME_OUT("CONNECT_TIME_OUT", "ϵͳ��ʱ�����Ժ�����!"),

    /** �Ƿ����� */
    ILLEGAL_REQUEST("ILLEGAL_REQUEST", "�Ƿ�����"),

    /** ϵͳ���� */
    SYSTEM_FAILURE("SYSTEM_FAILURE", "ϵͳ����"),

    /** ����Ϊ�� */
    NULL_ARGUMENT("NULL_ARGUMENT", "����Ϊ��"),

    /** ����Ϊ�� */
    NULL_OBJECT("NULL_OBJECT", "����Ϊ��"),

    /** �û�IDΪ��  */
    NULL_USER_ID("NULL_USER_ID", "�û�IDΪ��"),

    ERROR_USER_DATA("ERROR_USER_DATA", "�û�������"),
    
    /**���ݲ�����*/
    NO_RECORD("NO_RECORD", "û���������"),

    /** ������û�����ƥ��*/
    FAIL_QEURY_USER_CELL_AND_PASSWORD("FAIL_QEURY_USER_CELL_AND_PASSWORD", "������û�����ƥ��"),

    /** �û���������  */
    FAIL_QEURY_USER_BY_CELL("FAIL_USER_CELL", "�û���������"),

    /** */
    FAIL_QEURY_USER_BY_ID("FAIL_QEURY_USER_BY_ID", "�û�ID������"),

    USER_CELL_EXIST("USER_CELL_EXIST", "�ֻ����ѱ�ע��"),

    /** �ֻ�����Ϊ��  */
    NULL_USER_CELL("NULL_USER_CELL", "�ֻ�����Ϊ��"),

    /** ֤������Ϊ��  */
    NULL_CERT_NO("NULL_CERT_NO", "֤������Ϊ��"),

    GOOD_UPLOAD_ERROR("GOOD_UPLOAD_ERROR", "��Ʒ�ϴ��쳣"),

    ENTERPRISESERVICE_EDIT_ERROR("ENTERPRISESERVICE_EDIT_ERROR", "��ҵ������Ϣ�༭�쳣"),

    REQUEST_TO_BEAN_ERROR("REQUEST_TO_BEAN_ERROR", "��request����ֵ��װ��Beanʧ��"),

    POST_DATA_NOT_EXIT("POST_DATA_NOT_EXIT", "post��¼��Ϣ������"),

    URL_DECODER_ERROR("URL_DECODER_ERROR", "ת���쳣"),

    /** ��������ȷ */
    ILLEGAL_ARGUMENT("ILLEGAL_ARGUMENT", "��������ȷ"),

    MNG_USER_UNLISTED("UNLISTED", "���¼"),

    MNG_BEYOND_THE_WAITING_TIME("BWAT", "����ϵͳ�ȴ�ʱ�䣬�����µ�¼"),

    MNG_USER_UNAUTHORIZED("UNAUTHORIZED", "û��Ȩ��"),

    /** �߼����� */
    LOGIC_ERROR("LOGIC_ERROR", "�߼�����"),

    /** �����쳣 */
    DATA_ERROR("DATA_ERROR", "�����쳣"),

    /** �ݲ�֧�ֵĲ��� */
    UN_SUPPORT_OPERATER("UN_SUPPORT_OPERATER", "�ݲ�֧�ֵĲ���"),

    /** �û�����֤*/
    ALREADY_CERTIFY("ALREADY_CERTIFY", "�û�����֤"),

    /** ��Ч�û� ������֤*/
    NO_VALID_USER("NO_VALID_USER", "��Ч�û� ������֤"),

    /** �����û� ������֤*/
    LOCKED_USER("LOCKED_USER", "�����û� ������֤"),

    /** ��Ч�û� ������֤*/
    ID_PHOTO_OPERATE_FAIL("ID_PHOTO_OPERATE_FAIL", "ʵ����֤���֤��Ƭ �ֽڡ�������Ƭ ת��ʧ��"),

    /** ʵ����֤�ɹ�*/
    CERTIFY_SUCCESS("CERTIFY_SUCCESS", "ʵ����֤�ɹ�"),

    /** ʵ����֤ʧ��*/
    CERTIFY_FAIL("CERTIFY_FAIL", "ʵ����֤ʧ��"),

    /** ʵ����֤ʧ��  ���֤�Ѿ����û�*/
    CERTIFY_FAIL_ID_AREADY_EXSIT("CERTIFY_FAIL_ID_AREADY_EXSIT", "���֤�Ѿ����û� "),

    /** ��¼�������ʧ��*/
    LOGIN_PASSWORD_DECRYPT_ERROR("PASSWORD_DECRYPT_ERROR", "��¼�������ʧ��"),

    FAIL_SMS_SEND_OVER_TEN_TIME_PER_HOUR("FAIL_SMS_SEND_OVER_TEN_TIME_PER_HOUR", "ÿ��Сʱ��෢��10����֤�����"),

    FAIL_SMS_SEND_CHECK_CODE_ERROR("FAIL_SMS_SEND_CHECK_CODE_ERROR", "��֤�����"),

    FAIL_SMS_SEND_CHECK_CODE_OVERDUE("FAIL_SMS_SEND_CHECK_CODE_OVERDUE", "��֤�����"),

    FAIL_SMS_SEND_CHECK_CODE_CONCELL("FAIL_SMS_SEND_CHECK_CODE_CONCELL", "��֤�뷢���ѳ���ʮ�Σ�һ��Сʱ֮������"),

    /** �ֻ������޸�ʧ��*/
    FAIL_CELL_MODIFY("FAIL_CELL_MODIFY", "�ֻ������޸�ʧ��"),

    /** ״̬�޸�ʧ��*/
    FAIL_STATE_MODIFY("FAIL_STATE_MODIFY", "״̬�޸�ʧ��"),

    /** ��¼�����޸�ʧ��*/
    FAIL_LOGIN_PWD_MODIFY("FAIL_STATE_MODIFY", "��¼�����޸�ʧ��"),

    /** ֧�������޸�ʧ��*/
    FAIL_PAY_PWD_MODIFY("FAIL_STATE_MODIFY", "֧�������޸�ʧ��"),

    FAIL_VERIFY_NAME_MODIFY("FAIL_VERIFY_NAME_MODIFY", "�����û�ʵ����֤��Ϣʧ��"),

    /***************************************�û��ջ���ַ�쳣��**************************************************/
    USER_ADDRESS_AMOUNT_EXCESS("USER_ADDRESS_AMOUNT_EXCESS", "�û��ܵ��ջ���ַ����������"),

    FAIL_USER_ADDRESS_CREATE("FAIL_USER_ADDRESS_CREATE", "�û��ջ���ַ����ʧ��"),
    
    /** �ɹ���������ʧ��*/
    FAIL_ORDER_CREAT("FAIL_ORDER_CREAT","�ɹ���������ʧ��");

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
    private BaibCoreResultCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static BaibCoreResultCodeEnum getResultCodeEnumByCode(String code) {
        for (BaibCoreResultCodeEnum param : values()) {
            if (param.getCode().equals(code)) {
                return param;
            }
        }
        return null;
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
     * Getter method for property <tt>message</tt>.
     * 
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     * 
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * @see com.onway.platform.common.enums.EnumBase#message()
     */
    @Override
    public String message() {
        return message;
    }

    /** 
     * @see com.onway.platform.common.enums.EnumBase#value()
     */
    @Override
    public Number value() {
        return null;
    }
}
