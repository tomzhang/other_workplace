package com.onway.baib.core.cache.code;

/**
 * ��Ʒ����������
 * @author weina
 *
 */
public class InsuranceCodeBuilder extends CodeBuilder {

	@Override
	protected String getSuffix() {
		
		return "";
	}

	@Override
	protected String getPrefix() {
		
		return CodeGenerateConfig.INSURANCE_PRE;
	}

}
