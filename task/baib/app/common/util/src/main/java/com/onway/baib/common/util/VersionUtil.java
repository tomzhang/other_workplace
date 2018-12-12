package com.onway.baib.common.util;

import com.onway.platform.common.exception.BaseRuntimeException;

public class VersionUtil {

    /**
     * 
     * �Ƿ�С��ָ���汾 �������ݣ�
     * @param currentVersion
     * @param oldVersion
     * @param platform
     * @return
     */
    public static boolean isSupport(String currentVersion, String oldVersion) {
        return compareVersion(currentVersion, oldVersion) < 0;
    }

    /**
     * �Ƚϰ汾�ߵͣ�version1 &lt; version2 ����-1 �����ڷ���0�����ڷ���1
     * 
     * @param version1
     * @param version2
     * @return
     * @throws Exception
     */
    private static int compareVersion(String version1, String version2) {
        if (version1 == null || version2 == null) {
            throw new BaseRuntimeException("�汾�Ÿ�ʽ����");
        }
        String[] versionArray1 = version1.split("\\.");
        String[] versionArray2 = version2.split("\\.");
        int idx = 0;
        int minLength = Math.min(versionArray1.length, versionArray2.length);//ȡ��С����ֵ  
        int diff = 0;
        while (idx < minLength
               && (diff = versionArray1[idx].length() - versionArray2[idx].length()) == 0//�ȱȽϳ���  
               && (diff = versionArray1[idx].compareTo(versionArray2[idx])) == 0) {//�ٱȽ��ַ�  
            ++idx;
        }
        //����Ѿ��ֳ���С����ֱ�ӷ��أ����δ�ֳ���С�����ٱȽ�λ�������Ӱ汾��Ϊ��  
        diff = (diff != 0) ? diff : versionArray1.length - versionArray2.length;
        return diff;
    }

}
