package com.onway.baib.core.model;

/**
 * ��ȡ�������г���
 * 
 * @author jiaming.zhu
 * @version $Id: OrderCarResult.java, v 0.1 2017��2��8�� ����10:30:02 ZJM Exp $
 */
public class OrderCarResult {
    //�Ƿ�ͷ����ʶ
    private boolean isLeader = false;
    //����
    private String  type;
    //��ɫ
    private String  carColour;
    //����
    private String  carNo;
    //˾��
    private String  driver;
    //˾���绰
    private String  cell;

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean isLeader) {
        this.isLeader = isLeader;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

}
