package com.onway.baib.core.model;

/**
 * ��̨�Żݾ��ѯ
 * 
 * @author jiaming.zhu
 * @version $Id: GiftMngQueryInfo.java, v 0.1 2017��2��18�� ����6:06:23 ZJM Exp $
 */
public class GiftMngQueryInfo {
    //�û�����
    private String name;
    //�û�����
    private String type;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

}
