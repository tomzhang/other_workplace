package com.onway.baib.core.model;

/**
 * �⳵info
 * 
 * @author jiaming.zhu
 * @version $Id: DetectionInfo.java, v 0.1 2017��2��15�� ����6:03:16 ZJM Exp $
 */
public class DetectionInfo {
    //���̲�������
    private String  detectionDate;
    //���̲���ʱ��
    private String  detectionTime;
    //˵��
    private String  des;
    //�Ƿ񷵳�
    private boolean isBack = false;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public boolean isBack() {
        return isBack;
    }

    public void setBack(boolean isBack) {
        this.isBack = isBack;
    }

    public String getDetectionDate() {
        return detectionDate;
    }

    public void setDetectionDate(String detectionDate) {
        this.detectionDate = detectionDate;
    }

    public String getDetectionTime() {
        return detectionTime;
    }

    public void setDetectionTime(String detectionTime) {
        this.detectionTime = detectionTime;
    }

}
