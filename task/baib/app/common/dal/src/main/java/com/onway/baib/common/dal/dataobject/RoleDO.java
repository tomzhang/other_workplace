/**
 * onway.com Inc.
 * Copyright (c) 2013-2014 All Rights Reserved.
 */
 package com.onway.baib.common.dal.dataobject;

import com.onway.baib.common.dal.dataobject.BaseDO;

import java.util.Date;

/**
 * A data object class directly models database table <tt>baib_role</tt>.
 *
 * This file is generated by <tt>onway-gen-dal</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>onway</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/baib_role.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>onway-gen-dal</tt> 
 * to generate this file.
 *
 * @author guangdong.li
 * @version $Id: RoleDO.java,v 1.0 2013/10/29 07:34:20 guangdong.li Exp $
 */
public class RoleDO extends BaseDO {
    private static final long serialVersionUID = 741231858441822688L;

    //========== properties ==========

	/**
	 * This property corresponds to db column <tt>ID</tt>.
	 */
	private int id;

	/**
	 * This property corresponds to db column <tt>USER_ID</tt>.
	 */
	private String userId;

	/**
	 * This property corresponds to db column <tt>USER_NAME</tt>.
	 */
	private String userName;

	/**
	 * This property corresponds to db column <tt>PASSWORD</tt>.
	 */
	private String password;

	/**
	 * This property corresponds to db column <tt>ROLE</tt>.
	 */
	private String role;

	/**
	 * This property corresponds to db column <tt>CREATER</tt>.
	 */
	private String creater;

	/**
	 * This property corresponds to db column <tt>GMT_CREATE</tt>.
	 */
	private Date gmtCreate;

	/**
	 * This property corresponds to db column <tt>MODIFIER</tt>.
	 */
	private String modifier;

	/**
	 * This property corresponds to db column <tt>GMT_MODIFIED</tt>.
	 */
	private Date gmtModified;

	/**
	 * This property corresponds to db column <tt>MEMO</tt>.
	 */
	private String memo;

    //========== getters and setters ==========

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
	public int getId() {
		return id;
	}
	
	/**
	 * Setter method for property <tt>id</tt>.
	 * 
	 * @param id value to be assigned to property id
     */
	public void setId(int id) {
		this.id = id;
	}

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * Setter method for property <tt>userId</tt>.
	 * 
	 * @param userId value to be assigned to property userId
     */
	public void setUserId(String userId) {
		this.userId = userId;
	}

    /**
     * Getter method for property <tt>userName</tt>.
     *
     * @return property value of userName
     */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Setter method for property <tt>userName</tt>.
	 * 
	 * @param userName value to be assigned to property userName
     */
	public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Getter method for property <tt>password</tt>.
     *
     * @return property value of password
     */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Setter method for property <tt>password</tt>.
	 * 
	 * @param password value to be assigned to property password
     */
	public void setPassword(String password) {
		this.password = password;
	}

    /**
     * Getter method for property <tt>role</tt>.
     *
     * @return property value of role
     */
	public String getRole() {
		return role;
	}
	
	/**
	 * Setter method for property <tt>role</tt>.
	 * 
	 * @param role value to be assigned to property role
     */
	public void setRole(String role) {
		this.role = role;
	}

    /**
     * Getter method for property <tt>creater</tt>.
     *
     * @return property value of creater
     */
	public String getCreater() {
		return creater;
	}
	
	/**
	 * Setter method for property <tt>creater</tt>.
	 * 
	 * @param creater value to be assigned to property creater
     */
	public void setCreater(String creater) {
		this.creater = creater;
	}

    /**
     * Getter method for property <tt>gmtCreate</tt>.
     *
     * @return property value of gmtCreate
     */
	public Date getGmtCreate() {
		return gmtCreate;
	}
	
	/**
	 * Setter method for property <tt>gmtCreate</tt>.
	 * 
	 * @param gmtCreate value to be assigned to property gmtCreate
     */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

    /**
     * Getter method for property <tt>modifier</tt>.
     *
     * @return property value of modifier
     */
	public String getModifier() {
		return modifier;
	}
	
	/**
	 * Setter method for property <tt>modifier</tt>.
	 * 
	 * @param modifier value to be assigned to property modifier
     */
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

    /**
     * Getter method for property <tt>gmtModified</tt>.
     *
     * @return property value of gmtModified
     */
	public Date getGmtModified() {
		return gmtModified;
	}
	
	/**
	 * Setter method for property <tt>gmtModified</tt>.
	 * 
	 * @param gmtModified value to be assigned to property gmtModified
     */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

    /**
     * Getter method for property <tt>memo</tt>.
     *
     * @return property value of memo
     */
	public String getMemo() {
		return memo;
	}
	
	/**
	 * Setter method for property <tt>memo</tt>.
	 * 
	 * @param memo value to be assigned to property memo
     */
	public void setMemo(String memo) {
		this.memo = memo;
	}
}