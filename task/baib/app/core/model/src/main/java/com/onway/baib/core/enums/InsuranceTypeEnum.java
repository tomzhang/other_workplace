package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 
 * ��������ö����
 * @author weina
 * @version $Id: InsuranceTypeEnum.java, v 0.1 2016��12��5�� ����11:15:43 ROG Exp $
 */
public enum InsuranceTypeEnum {
    
    CDINSURANCE("0","������ ��λ��"),
    
    FIFTYINSURANCE("1", "������������50��"),
    
    HUNDREDINSURANCE("2", "������������100��"),
    
    HUNDREDANDFIFTY("3", "������������150��"),
    
    COMPULSORYINSURANCE("4","���������� ��ǿ��"),
    
    ;
    
    private String code;
    
    private String message;
    
    
    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static InsuranceTypeEnum getCommonStatusByCode(String code) {
        for (InsuranceTypeEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }
    

    private InsuranceTypeEnum(String code, String message) {
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
