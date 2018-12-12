/**
 * onway.com Inc.
 * Copyright (c) 2013-2015 All Rights Reserved.
 */
package com.onway.baib.core.cache.code;

/**
 * �����ű���������
 * 
 * @author li.hong
 * @version $Id: DigestCodeBuilder.java, v 0.1 2016��9��9�� ����11:55:49 li.hong Exp $
 */
public class OrderCodeBuilder extends CodeBuilder {

    /** 
     * @see com.onway.baib.core.cache.code.paycore.core.service.code.CodeBuilder#getSuffix()
     */
    @Override
    protected String getSuffix() {
        return "";
    }

    /** 
     * @see com.onway.baib.core.cache.code.paycore.core.service.code.CodeBuilder#getPrefix()
     */
    @Override
    protected String getPrefix() {
        return CodeGenerateConfig.ORDER_PRE;
    }

}
