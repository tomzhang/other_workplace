/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.baib.common.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * ZIPѹ������ 
 * 
 * @author guangdong.li
 * @version $Id: ZipUtils.java, v 0.1 21 Feb 2016 11:14:12 guangdong.li Exp $
 */
public class ZipUtils {

    private static final int BUFFER = 1024;

    /** 
     * �ļ� ��ѹ�� 
     *  
     * @param srcPath 
     *            Դ�ļ�·�� 
     *  
     * @throws Exception 
     */
    public static void decompress(String srcPath) throws Exception {
        File srcFile = new File(srcPath);

        decompress(srcFile);
    }

    /** 
     * ��ѹ�� 
     *  
     * @param srcFile 
     * @throws Exception 
     */
    public static void decompress(File srcFile) throws Exception {
        String basePath = srcFile.getParent();
        decompress(srcFile, basePath);
    }

    /** 
     * ��ѹ�� 
     *  
     * @param srcFile 
     * @param destFile 
     * @throws Exception 
     */
    public static List<String> decompress(File srcFile, File destFile) throws Exception {

        CheckedInputStream cis = new CheckedInputStream(new FileInputStream(srcFile), new CRC32());

        ZipInputStream zis = new ZipInputStream(cis);

        List<String> lists = decompress(destFile, zis);

        zis.close();

        return lists;
    }

    /** 
     * ��ѹ�� 
     *  
     * @param srcFile 
     * @param destPath 
     * @throws Exception 
     */
    public static List<String> decompress(File srcFile, String destPath) throws Exception {
        return decompress(srcFile, new File(destPath));

    }

    /** 
     * �ļ� ��ѹ�� 
     *  
     * @param srcPath 
     *            Դ�ļ�·�� 
     * @param destPath 
     *            Ŀ���ļ�·�� 
     * @throws Exception 
     */
    public static List<String> decompress(String srcPath, String destPath) throws Exception {

        File srcFile = new File(srcPath);
        return decompress(srcFile, destPath);
    }

    /** 
     * �ļ� ��ѹ�� 
     *  
     * @param destFile 
     *            Ŀ���ļ� 
     * @param zis 
     *            ZipInputStream 
     * @throws Exception 
     */
    private static List<String> decompress(File destFile, ZipInputStream zis) throws Exception {

        List<String> lists = new ArrayList<String>();
        ZipEntry entry = null;
        while ((entry = zis.getNextEntry()) != null) {

            // �ļ�  
            String dir = destFile.getPath() + File.separator + entry.getName();

            File dirFile = new File(dir);

            // �ļ����  
            fileProber(dirFile);

            if (entry.isDirectory()) {
                dirFile.mkdirs();
            } else {
                decompressFile(dirFile, zis);
                lists.add(dir);
            }

            zis.closeEntry();
        }
        return lists;
    }

    /** 
     * �ļ�̽�� 
     *  
     *  
     * ����Ŀ¼������ʱ������Ŀ¼�� 
     *  
     *  
     * @param dirFile 
     */
    private static void fileProber(File dirFile) {

        File parentFile = dirFile.getParentFile();
        if (!parentFile.exists()) {

            // �ݹ�Ѱ���ϼ�Ŀ¼  
            fileProber(parentFile);

            parentFile.mkdir();
        }

    }

    /** 
     * �ļ���ѹ�� 
     *  
     * @param destFile 
     *            Ŀ���ļ� 
     * @param zis 
     *            ZipInputStream 
     * @throws Exception 
     */
    private static void decompressFile(File destFile, ZipInputStream zis) throws Exception {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        int count;
        byte data[] = new byte[BUFFER];
        while ((count = zis.read(data, 0, BUFFER)) != -1) {
            bos.write(data, 0, count);
        }

        bos.close();
    }

}
