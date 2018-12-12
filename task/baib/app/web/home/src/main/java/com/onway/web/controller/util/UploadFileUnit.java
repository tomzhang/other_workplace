package com.onway.web.controller.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * �ļ��ϴ���Ԫ
 * 
 * @author wwf
 * @version $Id: UploadFileUnit.java, v 0.1 2016��8��15�� ����3:26:37 Administrator Exp $
 */
public class UploadFileUnit {

    // �ϴ����ļ�����
    private MultipartFile file;

    // �û����
    private String        userId;

    // ��ȡ��ַ·���ĵ�keyֵ
    private String        appointKey;

    // ���ļ�������
    private String        newFileName;

    private String        strFile;

    public String getStrFile() {
        return strFile;
    }

    public void setStrFile(String strFile) {
        this.strFile = strFile;
    }

    public String getNewFileName() {
        return newFileName;
    }

    public void setNewFileName(String newFileName) {
        this.newFileName = newFileName;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAppointKey() {
        return appointKey;
    }

    public void setAppointKey(String appointKey) {
        this.appointKey = appointKey;
    }

}
