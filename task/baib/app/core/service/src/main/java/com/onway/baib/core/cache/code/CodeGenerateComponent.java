/**
 * onway.com Inc.
 * Copyright (c) 2013-2015 All Rights Reserved.
 */
package com.onway.baib.core.cache.code;

/**
 * �����������
 * 
 * @author li.hong
 * @version $Id: CodeGenerateComponent.java, v 0.1 2016��9��9�� ����1:52:12 li.hong Exp $
 */
public interface CodeGenerateComponent {

    /**
     * �������ͻ�ñ��� 
     * @param codeType  ��������ö��
     * @return
     */
    public String nextCodeByType(CodeGenerateTypeEnum codeType);

}
