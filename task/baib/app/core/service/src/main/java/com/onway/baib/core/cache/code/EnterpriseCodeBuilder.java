package com.onway.baib.core.cache.code;

/**
 * ��ҵ����������
 * @author weina
 *
 */
public class EnterpriseCodeBuilder extends CodeBuilder {

	@Override
	protected String getSuffix() {
		return "";
	}

	@Override
	protected String getPrefix() {
		
		return CodeGenerateConfig.ENTERPRISE_PRE;
	}

}
