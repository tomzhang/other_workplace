package com.onway.baib.core.model;

/**
 * �⳵���ؽ����
 * 
 * @author jiaming.zhu
 * @version $Id: DetectionResult.java, v 0.1 2017��2��7�� ����11:41:39 ZJM Exp $
 */
public class DetectionResult {
    //������
    private String orderNo;
    //����ͼƬ
    private String carImg;
    //�ͺ�
    private String carType;
    //��ɫ
    private String carColour;
    //˾��
    private String driver;
    //����
    private String carNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCarImg() {
        return carImg;
    }

    public void setCarImg(String carImg) {
        this.carImg = carImg;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

}
