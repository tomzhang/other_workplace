package com.onway.baib.biz.service.query;
/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */

import com.onway.baib.core.enums.SysConfigCacheKeyEnum;
import com.onway.baib.core.model.SysConfigModel;
import com.onway.platform.common.base.QueryResult;

/**
 * ���û������
 * 
 * @author guangdong.li
 * @version $Id: SysConfigCacheService.java, v 0.1 17 Feb 2016 15:43:57 guangdong.li Exp $
 */
public interface SysConfigCacheService {
    /**
     * ���ݲ������õ�key��ȡ��Ӧ��value
     * 
     * @param configKeyEnum ���õ�key
     * 
     * @return
     */
    public QueryResult<SysConfigModel> getConfigValue(SysConfigCacheKeyEnum configKeyEnum);
}
