package com.onway.baib.core.model;


/**
 * �Żݾ��ѯinfo
 * 
 * @author jiaming.zhu
 * @version $Id: GiftQueryInfo.java, v 0.1 2017��2��18�� ����1:52:38 ZJM Exp $
 */
public class GiftQueryInfo {
    //�Żݾ�����
    private int    totalNum;
    //ʣ���Żݾ�
    private int    alUseNum;
    //��ֹʱ��
    private String limitDate;
    //����
    private String rule;
    //����
    private String title;
    //˵��
    private String des;
    //���
    private String amount;
    //�Żݾ�Id
    private String giftId;

    public String getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getGiftId() {
        return giftId;
    }

    public void setGiftId(String giftId) {
        this.giftId = giftId;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getAlUseNum() {
        return alUseNum;
    }

    public void setAlUseNum(int alUseNum) {
        this.alUseNum = alUseNum;
    }

}
