package com.onway.baib.core.model;

/**
 * ����״̬�������
 * 
 * @author jiaming.zhu
 * @version $Id: DriverUsingDetail.java, v 0.1 2017��2��8�� ����1:50:45 ZJM Exp $
 */
public class DriverUsingDetail {

    //����
    private String title;
    //����ʱ��
    private String Datetime;
    //ʱ��
    private String time;
    //˵��
    private String des;
    //״̬
    private String status;
    //ͼƬ��ַ����ʼ�������������ʱ��ͼƬ��
    private String img;
    //��ʼ������(��������ʱ)
    private String startMileage = "0";
    //����������(��������ʱ)
    private String endMileage   = "0";
    //������(��������ʱ)
    private String diffMileage  = "0";
    //����������(��������ʱ)
    private String overMileage  = "0";

    public String getStartMileage() {
        return startMileage;
    }

    public void setStartMileage(String startMileage) {
        this.startMileage = startMileage;
    }

    public String getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(String endMileage) {
        this.endMileage = endMileage;
    }

    public String getDiffMileage() {
        return diffMileage;
    }

    public void setDiffMileage(String diffMileage) {
        this.diffMileage = diffMileage;
    }

    public String getOverMileage() {
        return overMileage;
    }

    public void setOverMileage(String overMileage) {
        this.overMileage = overMileage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDatetime() {
        return Datetime;
    }

    public void setDatetime(String datetime) {
        Datetime = datetime;
    }

}
