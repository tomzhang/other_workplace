/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.core.model;

import com.onway.platform.common.base.ToString;

/**
 * �������ö���ģ��
 * 
 * @author guangdong.li
 * @version $Id: SysConfigModel.java, v 0.1 17 Feb 2016 15:57:07 guangdong.li Exp $
 */
public class SysConfigModel extends ToString {

    /**  */
    private static final long serialVersionUID = 8737942918083647062L;

    /** ��������*/
    private String configName;

    /** ����ֵ*/
    private String configValue;

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
