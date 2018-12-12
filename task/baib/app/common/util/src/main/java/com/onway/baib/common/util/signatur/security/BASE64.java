package com.onway.baib.common.util.signatur.security;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * base64����
 * 
 * @author guangdong.li
 * @version $Id: BASE64.java, v 0.1 17 Feb 2016 16:52:45 guangdong.li Exp $
 */
public class BASE64 {

    /**
     * BASE64����
     * 
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64����
     * 
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public static void main(String[] args) throws Exception {
        String data = BASE64.encryptBASE64("A190034DE069526E27FF0BC0499FF009".getBytes());
        System.out.println("����ǰ��" + data);

        byte[] byteArray = BASE64.decryptBASE64(data);
        System.out.println("���ܺ�" + new String(byteArray));
    }

}
