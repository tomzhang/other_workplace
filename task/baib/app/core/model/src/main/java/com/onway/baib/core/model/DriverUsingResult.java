package com.onway.baib.core.model;

import java.util.List;

/**
 * ˾�����ó���
 * 
 * @author jiaming.zhu
 * @version $Id: DriverUsingResult.java, v 0.1 2017��2��8�� ����11:59:37 ZJM Exp $
 */
public class DriverUsingResult {
    //������
    private String                  orderNo;
    //����ͼƬ
    private String                  carIcon;
    //�ͺ�
    private String                  type;
    //��ɫ
    private String                  colour;
    //����
    private String                  carNo;
    //������
    private String                  businessName;
    //��������ϵ�绰
    private String                  businessCell;
    //�û���ϵ��
    private String                  userName;
    //�û��绰
    private String                  userCell;
    //����
    private List<DriverUsingDetail> driverUsingDetailList;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getCarIcon() {
        return carIcon;
    }

    public void setCarIcon(String carIcon) {
        this.carIcon = carIcon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessCell() {
        return businessCell;
    }

    public void setBusinessCell(String businessCell) {
        this.businessCell = businessCell;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCell() {
        return userCell;
    }

    public void setUserCell(String userCell) {
        this.userCell = userCell;
    }

    public List<DriverUsingDetail> getDriverUsingDetailList() {
        return driverUsingDetailList;
    }

    public void setDriverUsingDetailList(List<DriverUsingDetail> driverUsingDetailList) {
        this.driverUsingDetailList = driverUsingDetailList;
    }

}
