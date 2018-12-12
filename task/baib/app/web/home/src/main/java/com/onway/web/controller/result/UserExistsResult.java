package com.onway.web.controller.result;

/**
 * onway.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */

/**
 * 
 * @author wenbing.zhang
 * @version $Id: UserExistsResult.java, v 0.1 2014��7��22�� ����8:11:45 yylc025 Exp $
 */
public class UserExistsResult extends JsonResult {

    public UserExistsResult(boolean bizSucc, String errCode, String message) {
        super(bizSucc, errCode, message);
    }

    public UserExistsResult(boolean bizSucc) {
        super(bizSucc);
    }

    /** serialVersionUID  */
    private static final long serialVersionUID = -178062843094042272L;

    /** �Ƿ�����û�*/
    private boolean           isExistUser      = false;

    /** �Ƿ��������*/
    private boolean           isExistPasswd    = false;

    public boolean isExistUser() {
        return isExistUser;
    }

    public void setExistUser(boolean isExistUser) {
        this.isExistUser = isExistUser;
    }

    public boolean isExistPasswd() {
        return isExistPasswd;
    }

    public void setExistPasswd(boolean isExistPasswd) {
        this.isExistPasswd = isExistPasswd;
    }

}
