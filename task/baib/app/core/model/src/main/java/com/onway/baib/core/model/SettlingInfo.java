package com.onway.baib.core.model;

import java.util.List;

/**
 * �����˷��ؽ����
 * 
 * @author jiaming.zhu
 * @version $Id: SettlingInfo.java, v 0.1 2017��2��8�� ����10:20:02 ZJM Exp $
 */
public class SettlingInfo {
    //�������ܶ�
    private String               allAmount;
    //�������б�
    private List<SettlingResult> settlingResultList;

    public String getAllAmount() {
        return allAmount;
    }

    public void setAllAmount(String allAmount) {
        this.allAmount = allAmount;
    }

    public List<SettlingResult> getSettlingResultList() {
        return settlingResultList;
    }

    public void setSettlingResultList(List<SettlingResult> settlingResultList) {
        this.settlingResultList = settlingResultList;
    }

}
