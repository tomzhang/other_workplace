package com.onway.baib.core.model;

/**
 * ������
 * 
 * @author jiaming.zhu
 * @version $Id: SettlingResult.java, v 0.1 2017��2��8�� ����10:02:06 ZJM Exp $
 */
public class SettlingResult {
    //����Id
    private String settleId;
    //�ύ��������
    private String settleDate;
    //�ύ����ʱ��
    private String settleTime;
    //�����ܶ�
    private String totalAmount;
    //��������
    private int    ordersNum;

    public String getSettleId() {
        return settleId;
    }

    public void setSettleId(String settleId) {
        this.settleId = settleId;
    }

    public String getSettleDate() {
        return settleDate;
    }

    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }

    public String getSettleTime() {
        return settleTime;
    }

    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getOrdersNum() {
        return ordersNum;
    }

    public void setOrdersNum(int ordersNum) {
        this.ordersNum = ordersNum;
    }

}
