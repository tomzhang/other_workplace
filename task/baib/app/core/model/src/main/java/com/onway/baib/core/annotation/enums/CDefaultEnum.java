package com.onway.baib.core.annotation.enums;

import com.onway.common.lang.StringUtils;
import com.onway.platform.common.enums.EnumBase;

/**
 * �Ƿ�ΪĬ��
 * @author weina
 *
 */
public enum CDefaultEnum implements EnumBase{
	
	DEFAULT("1", "Ĭ��"),
	UNDEFAULT("0", "��Ĭ��"),
	;

	/**ö���� */
    private String code;

    /**������Ϣ*/
    private String message;
    
	private CDefaultEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	/**
	 * ͨ��ö��<code>code</code>���ö��
	 * @param code
	 * @return
	 */
	public static CDefaultEnum getCDefaulEnumByCode(String code){
		for (CDefaultEnum param : values()) {
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
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Number value() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
