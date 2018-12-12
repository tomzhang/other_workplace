package com.onway.baib.common.util;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/**
 * 3DES���ܹ�����
 * 
 * @author li.hong
 */
public class Des3 {
    // ��Կ
    private final static String secretKey = "liuyunqiang@lx100$#365#$";
    // ����
    private final static String iv        = "01234567";
    // �ӽ���ͳһʹ�õı��뷽ʽ
    private final static String encoding  = "utf-8";

    /**
     * 3DES����
     * 
     * @param plainText ��ͨ�ı�
     * @return
     * @throws Exception 
     */
    public static String encode(String plainText) throws Exception {
        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(secretKey.getBytes());
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);

        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
        byte[] encryptData = cipher.doFinal(plainText.getBytes(encoding));
        return Base64.encode(encryptData);
    }

    /**
     * 3DES����
     * 
     * @param encryptText �����ı�
     * @return
     * @throws Exception
     */
    public static String decode(String encryptText) throws Exception {
        Key deskey = null;
        DESedeKeySpec spec = new DESedeKeySpec(secretKey.getBytes());
        SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
        deskey = keyfactory.generateSecret(spec);
        Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, deskey, ips);

        byte[] decryptData = cipher.doFinal(Base64.decode(encryptText));

        return new String(decryptData, encoding);
    }

    public static void main(String[] args) {

        try {

            //System.out.println(encode("3551327"));
            System.out.println(decode("1i2I1c9hxn8="));

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }
}
