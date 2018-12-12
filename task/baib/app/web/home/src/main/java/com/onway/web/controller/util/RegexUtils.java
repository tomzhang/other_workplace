/**
 * onway.com Inc.
 * Copyright (c) 2013-2015 All Rights Reserved.
 */
package com.onway.web.controller.util;

/**
 * ������ʽ������
 * 
 * @author hong.li
 * @version $Id: RegexUtils.java, v 0.1 2015��1��15�� ����6:00:55 hong.li Exp $
 */
public class RegexUtils {
    
    /**
     * �ж��Ƿ�Ϊ�绰����  ֻ�ж�11λ�ĵ绰���� ǰ�治����+86
     * 
     * @param cell
     * @return
     */
    public static boolean isCellNumber(String cell){
        if(cell==null){
            return false;
        }
        return cell.matches("^[1][2-9]\\d{9}$");
    }

}
