package com.onway.baib.core.model;

import com.onway.platform.common.base.ToString;

/**
 * �ֶε���
 * 
 * @author wwf
 * @version $Id: Item.java, v 0.1 2016��9��7�� ����5:46:55 wwf Exp $
 */
public class Item extends ToString {
    /**  */
    private static final long serialVersionUID = 1L;

    // ��������
    private String            zh_name;

    // Ӣ���ֶ�
    private String            field;

    // ��Ϊ��     true ��Ϊ��;false ����Ϊ��
    private boolean           notnull;

    // �Ƿ�չʾ  true չʾ��false ��չʾ
    private boolean           showOrNot;

    // ��󳤶�
    private int               maxlength;

    //�Ƿ�չʾ�ڱ�
    private boolean           formShowOrNot;

    //��������ҳ�е����� 
    private String            dataWebType;

    public String getDataWebType() {
        return dataWebType;
    }

    public void setDataWebType(String dataWebType) {
        this.dataWebType = dataWebType;
    }

    public boolean isNotnull() {
        return notnull;
    }

    public void setNotnull(boolean notnull) {
        this.notnull = notnull;
    }

    public boolean isShowOrNot() {
        return showOrNot;
    }

    public void setShowOrNot(boolean showOrNot) {
        this.showOrNot = showOrNot;
    }

    public int getMaxlength() {
        return maxlength;
    }

    public void setMaxlength(int maxlength) {
        this.maxlength = maxlength;
    }

    public String getZh_name() {
        return zh_name;
    }

    public void setZh_name(String zh_name) {
        this.zh_name = zh_name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean isFormShowOrNot() {
        return formShowOrNot;
    }

    public void setFormShowOrNot(boolean formShowOrNot) {
        this.formShowOrNot = formShowOrNot;
    }

}
