/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.common.util;

import java.util.Calendar;

import com.onway.common.lang.StringUtils;

/**
 * ���֤�������Ϣ�ĸ�����
 * 
 * @author guangdong.li
 * @version $Id: CertNoInfoHelper.java, v 0.1 24 Feb 2016 13:40:32 guangdong.li Exp $
 */
public class CertNoInfoHelper {

    /**
     * �������֤��ȡ��������
     * 
     * @param certNo
     * @return
     */
    public static String buildBirthday(String certNo) {
        if (StringUtils.isNotBlank(certNo) && (certNo.length() == 15 || certNo.length() == 18)) {
            if (certNo.length() == 15) {
                certNo = pid15To18(certNo);
            }
            return certNo.substring(6, 14);
        }
        return null;
    }

    /**
     * �������֤��ȡ��ʡ����Ϣ
     * 
     * @param certNo
     * @return
     */
    public static String buildProCity(String certNo) {
        //TODO ͨ�����֤��ȡס��ַ
        return "�㽭ʡ�������������Ŷ�·701���Ͻ�㳡C��";
    }

    /**
     * ��ȡ��ʽ����������(yyyy-MM-dd HH:mm:ss)
     * 
     * @param certNo
     * @return
     */
    public static String buildFormatBirthday(String certNo) {
        String birthday = buildBirthday(certNo);
        if (birthday != null && birthday.length() == 8) {
            return birthday.substring(0, 4) + "-" + birthday.substring(4, 6) + "-"
                   + birthday.substring(6, 8) + " 00:00:00";
        }
        return "";
    }

    public static int buildAge(String certNo) {
        String birthday = buildBirthday(certNo);
        if (birthday != null) {
            Calendar birth = Calendar.getInstance();
            birth.set(Calendar.YEAR, Integer.parseInt(birthday.substring(0, 4)));
            birth.set(Calendar.MONTH, Integer.parseInt(birthday.substring(4, 6)) - 1);
            birth.set(Calendar.DAY_OF_MONTH, Integer.parseInt(birthday.substring(6, 8)));

            Calendar today = Calendar.getInstance();
            return getYearDiff(today, birth);
        }
        return 0;
    }

    public static int getYearDiff(Calendar today, Calendar birth) {
        int day = today.get(Calendar.DAY_OF_MONTH) - birth.get(Calendar.DAY_OF_MONTH);
        int month = today.get(Calendar.MONTH) - birth.get(Calendar.MONTH);
        int year = today.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

        if (month > 0) {
            return year;
        }

        if (month < 0) {
            return year - 1;
        }

        return day >= 0 ? year : year - 1;

        //        int diffMonths = day >= 0 ? ((year - 1) * 12 + month + 1) : ((year - 1) * 12 + month - 1);
        //        return (diffMonths + 11) / 12;
    }

    /**
     * �������֤��ȡ�Ա�
     * 
     * @param certNo
     * @return M:��, F:Ů
     */
    public static String buildSex(String certNo) {
        if (StringUtils.isNotBlank(certNo) && (certNo.length() == 15 || certNo.length() == 18)) {
            if (certNo.length() == 15) {
                certNo = pid15To18(certNo);
            }
            if (Integer.parseInt(certNo.substring(16, 17)) % 2 == 0) {
                return "2";
            }
            return "1";
        }
        return null;
    }

    /**
     * 15λ���֤��ת18λ
     * 
     * @param id
     * @return
     */
    public static final String pid15To18(String id) {
        final int[] W = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 };
        final String[] A = { "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2" };
        int i, j, s = 0;
        String newid;
        newid = id;
        newid = newid.substring(0, 6) + "19" + newid.substring(6, id.length());
        for (i = 0; i < newid.length(); i++) {
            j = Integer.parseInt(newid.substring(i, i + 1)) * W[i];
            s = s + j;
        }
        s = s % 11;
        newid = newid + A[s];
        return newid;
    }

    public static void main(String[] args) {
        Calendar birth = Calendar.getInstance();
        birth.set(Calendar.YEAR, 1997);
        birth.set(Calendar.MONTH, 7);
        birth.set(Calendar.DAY_OF_MONTH, 14);

        Calendar today = Calendar.getInstance();
        System.out.println(getYearDiff(today, birth));
    }

}
