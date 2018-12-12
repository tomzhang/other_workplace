/**
 * onway.com Inc.
 * Copyright (c) 2013-2015 All Rights Reserved.
 */
package com.onway.baib.core.cache.code;

/**
 * �������ɹ�������
 * 
 * @author li.hong
 * @version $Id: CodeGenerateConfig.java, v 0.1 2016��9��9�� ����11:55:23 li.hong Exp $
 */
public interface CodeGenerateConfig {

    /** ѭ������  */
    public static int NO_CIRCLE        = 100000000;

    /** seq����  */
    public static int NO_CIRCLE_LENGTH = 7;

    /** seq��ʼֵ */
    public static int INIT_VALUE       = 1;

    /** seq�������� */
    public static int INCREMENT_STEP   = 1;

    /** ������ǰ׺*/
    String            ORDER_PRE        = "8001";

    /** ԤԼ��ǰ׺*/
    String            SUBSCRIBE_PRE        = "8002";
    
    /**��ҵ��ǰ׺*/
    String ENTERPRISE_PRE = "8003";
    
    /**��Ʒ��ǰ׺*/
    String GOOD_PRE = "8004";
    
    /**���պ�ǰ׺*/
    String INSURANCE_PRE ="8005";

}
