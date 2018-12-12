package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;
/**
 * ��������Ʒ��ö����
 * 
 * @author weina
 * @version $Id: IntentionBrandEnum.java, v 0.1 2016��12��5�� ����11:23:53 ROG Exp $
 */
public enum IntentionBrandEnum {
    
    PICC("0", "�й��˱�"),
    
    CONTINENT("1", "��ر���"),
    
    PINGAN("2", "ƽ������"),
    
    UNITED("3", "�л�����"),
    
    AXA("4", "��ʢ��ƽ"),
    
    LIBERTY("5", "��������"),
    
    ;
    
    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static IntentionBrandEnum getCommonStatusByCode(String code) {
        for (IntentionBrandEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }
    
    private String code;
    
    private String message;

    private IntentionBrandEnum(String code, String message) {
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
