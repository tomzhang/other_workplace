package com.onway.baib.core.model;

/**
 * ������
 * 
 * @author jiaming.zhu
 * @version $Id: OrderSettleResult.java, v 0.1 2017��2��7�� ����8:28:58 ZJM Exp $
 */
public class OrderSettleResult {
    //������
    private String orderNo;
    //�����ͺ�
    private String type;
    //����ͼƬ
    private String Icon;
    //�ó�ʱ��
    private String useTime;
    //�ɽ������
    private String settleAmount;

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(String settleAmount) {
        this.settleAmount = settleAmount;
    }

}
