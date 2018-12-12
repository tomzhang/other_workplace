/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.core.exception;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * ����ʱ�쳣
 * 
 * @author guangdong.li
 * @version $Id: BaseRuntimeException.java, v 0.1 2013-10-30 ����3:10:35  Exp $
 */
public class BaseRuntimeException extends RuntimeException {

    /**  serialVersionUID */
    private static final long serialVersionUID = 8321149154706648074L;

    protected String          message;

    /**
     * �չ�������
     */
    public BaseRuntimeException() {
        super();
    }

    /**
     * ��������
     * 
     * @param message
     *            ��Ϣ
     */
    public BaseRuntimeException(String message) {
        super(message);
    }

    /**
     * ��������
     * 
     * @param cause
     *            ԭ��
     */
    public BaseRuntimeException(Throwable cause) {
        super(cause);
    }

    /**
     * ��������
     * 
     * @param message
     *            ��Ϣ
     * @param cause
     *            ԭ��
     */
    public BaseRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @see Throwable#toString()
     */
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
