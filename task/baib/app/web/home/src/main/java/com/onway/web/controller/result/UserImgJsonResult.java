package com.onway.web.controller.result;

/**
 * �û�ͼ����Ϣ�����
 * 
 * @author qiang.wq
 * @version $Id: UserImgJsonResult.java, v 0.1 2015��9��4�� ����4:13:23 qiang.wq Exp $
 */
public class UserImgJsonResult extends JsonResult {


	public UserImgJsonResult(boolean bizSucc, String errCode, String message) {
		super(bizSucc, errCode, message);
	}

	/** serialVersionUID */
    private static final long serialVersionUID = -6929937906521074512L;

    /** ͼƬ��ַ */
    private String            imgUrl           = "";

    /** �Ƿ����ù�ͼƬ */
    private boolean           isSetImg;
    
    /** �ļ�·�� */
    private String            filePath;
    
    /** �û�Id */
    private String            userId;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isSetImg() {
        return isSetImg;
    }

    public void setSetImg(boolean isSetImg) {
        this.isSetImg = isSetImg;
    }
}
