package com.finace.miscroservice.user.service;


import com.finace.miscroservice.user.po.BorrowerInfoPO;

/**
 *
 */
public interface BorrowerInfoService {

    /**
     * 根据用户id获取借款人信息
     * @param userId
     * @return
     */
    public BorrowerInfoPO getBorrowerInfoByUserId(String userId);

    /**
     * 新增借款人信息
     * @param borrowerInfoPO
     * @return
     */
    public int addBorrowerInfo(BorrowerInfoPO borrowerInfoPO);




}
