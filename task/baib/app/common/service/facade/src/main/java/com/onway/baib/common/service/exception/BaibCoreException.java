package com.onway.baib.common.service.exception;

/**
 * onway.com Inc.
 * Copyright (c) 2013-2013 All Rights Reserved.
 */

import com.onway.platform.common.enums.EnumBase;
import com.onway.platform.common.exception.BaseRuntimeException;

/**
 * ͨ�����쳣������Error�������жϴ���Ľ����
 * 
 * @author guangdong.li
 * @version $Id: CifCoreException.java, v 0.1 2013-11-18 ����11:31:57  Exp $
 */
public class BaibCoreException extends BaseRuntimeException {

    /** serialVersionUID */
    private static final long serialVersionUID = 6687164311142885369L;

    /**
     * 
     */
    public BaibCoreException() {
        super();
    }

    /**
     * @param baseEnum
     * @param message
     */
    public BaibCoreException(EnumBase baseEnum, String message) {
        super(baseEnum, message);
    }

    /**
     * @param baseEnum
     */
    public BaibCoreException(EnumBase baseEnum) {
        super(baseEnum);
    }

    /**
     * @param errorCode
     * @param message
     * @param cause
     */
    public BaibCoreException(String errorCode, String message, Throwable cause) {
        super(errorCode, message, cause);
    }

    /**
     * @param errorCode
     * @param message
     */
    public BaibCoreException(String errorCode, String message) {
        super(errorCode, message);
    }

    /**
     * @param message
     * @param cause
     */
    public BaibCoreException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param message
     */
    public BaibCoreException(String message) {
        super(message);
    }

    /**
     * @param cause
     */
    public BaibCoreException(Throwable cause) {
        super(cause);
    }

}