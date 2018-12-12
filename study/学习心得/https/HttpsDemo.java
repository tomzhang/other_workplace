package com.finace.miscroservice;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.KeyStore;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

public class HttpsDemo {
    private final static String PFX_PATH = "C:\\Users\\nessary\\Desktop\\client.p12";	//客户端证书路径
    private final static String PFX_PWD = "879227577";	//客户端证书密码


    public static String sslRequestGet(String url) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");
        InputStream instream = new FileInputStream(new File(PFX_PATH));
        try {
            keyStore.load(instream, PFX_PWD.toCharArray());
        } finally {
            instream.close();
        }

        SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, PFX_PWD.toCharArray()).build();
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext
                , new String[] { "TLSv1" }	// supportedProtocols ,这里可以按需要设置
                , null	// supportedCipherSuites
                , SSLConnectionSocketFactory.getDefaultHostnameVerifier());

        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        try {
            HttpGet httpget = new HttpGet(url);
//			httpost.addHeader("Connection", "keep-alive");// 设置一些heander等
            CloseableHttpResponse response = httpclient.execute(httpget);
            try {
                HttpEntity entity = response.getEntity();
                String jsonStr = EntityUtils.toString(response.getEntity(), "UTF-8");//返回结果
                EntityUtils.consume(entity);
                return jsonStr;
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("java.home"));
        System.out.println(sslRequestGet("https://test.etongjin.net/log"));
    }
}