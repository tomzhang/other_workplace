package com.onway.baib.core.enums;

import com.onway.common.lang.StringUtils;
import com.onway.platform.common.enums.EnumBase;

/**
 * ��̨�ļ��ϴ�ö��  
 *   Ҫ��ӵ�ַ���������ö�����͵�ͬʱ����system-config.properties �ļ��������
 * 
 * @author wwf
 * @version $Id: MngFileUploadUrlEnum.java, v 0.1 2016��9��19�� ����11:32:11 wwf Exp $
 */
public enum MngFileUploadUrlEnum implements EnumBase {

    // ��Ʒ
    GOODS("goods", "goodImage/attachment"),

    // �ҳ��
    ACTIVEINFO("active", "activeInfo/attachment"),

    // ��ҵ
    FIRM("firm", "firm/attachment"),
    
    // �û�ͼƬ
    USERIMAGE("userImage", "/attachment"),

    ;

    /** ö����*/
    private String code;

    /** ������Ϣ*/
    private String message;

    private MngFileUploadUrlEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * @see com.onway.platform.common.enums.EnumBase#message()
     */
    @Override
    public String message() {
        return message;
    }

    /** 
     * @see com.onway.platform.common.enums.EnumBase#value()
     */
    @Override
    public Number value() {
        return null;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static MngFileUploadUrlEnum getMngFileUploadUrlEnumByCode(String code) {
        for (MngFileUploadUrlEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }
        return null;
    }
}
