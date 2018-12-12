package com.onway.web.controller.result;

/**
 * ���ٵ�¼�����(���������Ƿ�����֧����������)
 * 
 * @author guangdong.li
 * @version $Id: FastLoginResult.java, v 0.1 2013-9-12 ����5:53:33 WJL Exp $
 */
public class FastLoginResult extends JsonResult {

    public FastLoginResult(boolean bizSucc) {
        super(bizSucc);
    }

    public FastLoginResult(boolean bizSucc, String errCode, String message) {
        super(bizSucc, errCode, message);
    }

    /** serialVersionUID */
    private static final long serialVersionUID = 5198841746337278942L;

    /** �û�id */
    private String            userId;

    /** �û�ʵ�� */
    private String            realName;

    /** �û�֤�� */
    private String            certNo;

    /** �����������п���״̬ */
    private String            baibdState;

    /** �û�״̬ */
    private String            userState;

    /** ����֧������(1:������    0:δ����  ) */
    private boolean           isPayPwd         = false;

    /** �Ƿ��׹� (true: ���׹�  false:δ���׹�-Ĭ��)*/
    private boolean           isTrade          = false;

    /** �Ƿ������õ�¼���� (true: ������  false: δ����-Ĭ��)*/
    private boolean           isLoginPwd       = false;

    /** �Ƿ��Ѱ�������п� */
    private boolean           isBindbaibd       = false;
    
    /**�û���¼�ֻ���**/
    private String cell;

    /** ����΢�Ŷ�token*/
    private String            token;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getCertNo() {
        return certNo;
    }

    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    public String getbaibdState() {
        return baibdState;
    }

    public void setbaibdState(String baibdState) {
        this.baibdState = baibdState;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public boolean isTrade() {
        return isTrade;
    }

    public void setTrade(boolean isTrade) {
        this.isTrade = isTrade;
    }

    public boolean isBindbaibd() {
        return isBindbaibd;
    }

    public void setBindbaibd(boolean isBindbaibd) {
        this.isBindbaibd = isBindbaibd;
    }

    public boolean isPayPwd() {
        return isPayPwd;
    }

    public void setPayPwd(boolean isPayPwd) {
        this.isPayPwd = isPayPwd;
    }

    public boolean isLoginPwd() {
        return isLoginPwd;
    }

    public void setLoginPwd(boolean isLoginPwd) {
        this.isLoginPwd = isLoginPwd;
    }

    /**
     * Getter method for property <tt>token</tt>.
     * 
     * @return property value of token
     */
    public String getToken() {
        return token;
    }

    /**
     * Setter method for property <tt>token</tt>.
     * 
     * @param token value to be assigned to property token
     */
    public void setToken(String token) {
        this.token = token;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

}
