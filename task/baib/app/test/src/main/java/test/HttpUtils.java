package test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
* HTTP������
* 
* @author 
* 
*/
public class HttpUtils {
    private static Log                                log                          = LogFactory
                                                                                       .getLog(HttpUtils.class);
    /**
    * ��������ʽ UTF-8
    */
    public static final String                        URL_PARAM_DECODECHARSET_UTF8 = "UTF-8";

    /**
    * ��������ʽ GBK
    */
    public static final String                        URL_PARAM_DECODECHARSET_GBK  = "GBK";

    private static final String                       URL_PARAM_CONNECT_FLAG       = "&";

    private static final String                       EMPTY                        = "";

    private static MultiThreadedHttpConnectionManager connectionManager            = null;

    private static int                                connectionTimeOut            = 25000;

    private static int                                socketTimeOut                = 25000;

    private static int                                maxConnectionPerHost         = 20;

    private static int                                maxTotalConnections          = 20;

    private static HttpClient                         client;

    static {
        connectionManager = new MultiThreadedHttpConnectionManager();
        connectionManager.getParams().setConnectionTimeout(connectionTimeOut);
        connectionManager.getParams().setSoTimeout(socketTimeOut);
        connectionManager.getParams().setDefaultMaxConnectionsPerHost(maxConnectionPerHost);
        connectionManager.getParams().setMaxTotalConnections(maxTotalConnections);
        client = new HttpClient(connectionManager);
    }

    /**
    * POST��ʽ�ύ����
    * @param url
    *             �������URL
    * @param params
    *             Ҫ�ύ������
    * @param enc
    *             ����
    * @return
    *             ��Ӧ���
    * @throws IOException
    *             IO�쳣
    */
    public static String URLPost(String url, Map<String, String> params, String enc) {

        String response = EMPTY;
        PostMethod postMethod = null;
        try {
            postMethod = new PostMethod(url);
            postMethod.setRequestHeader("Content-Type",
                "application/x-www-form-urlencoded;charset=" + enc);
            //������ֵ����postMethod��
            Set<String> keySet = params.keySet();
            for (String key : keySet) {
                String value = params.get(key);
                postMethod.addParameter(key, value);
            }
            //ִ��postMethod
            int statusCode = client.executeMethod(postMethod);
            if (statusCode == HttpStatus.SC_OK) {
                response = postMethod.getResponseBodyAsString();
            } else {
                log.error("��Ӧ״̬�� = " + postMethod.getStatusCode());
            }
        } catch (HttpException e) {
            log.error("�����������쳣��������Э�鲻�Ի��߷��ص�����������", e);
            e.printStackTrace();
        } catch (IOException e) {
            log.error("���������쳣", e);
            e.printStackTrace();
        } finally {
            if (postMethod != null) {
                postMethod.releaseConnection();
                postMethod = null;
            }
        }

        return response;
    }

    /**
    * GET��ʽ�ύ����
    * @param url
    *             �������URL
    * @param params
    *             Ҫ�ύ������
    * @param enc
    *             ����
    * @return
    *             ��Ӧ���
    * @throws IOException
    *             IO�쳣
    */
    public static String URLGet(String url, Map<String, String> params, String enc) {

        String response = EMPTY;
        GetMethod getMethod = null;
        StringBuffer strtTotalURL = new StringBuffer(EMPTY);

        if (strtTotalURL.indexOf("?") == -1) {
            strtTotalURL.append(url).append("?").append(getUrl(params, enc));
        } else {
            strtTotalURL.append(url).append("&").append(getUrl(params, enc));
        }
        log.debug("GET����URL = /n" + strtTotalURL.toString());

        try {
            getMethod = new GetMethod(strtTotalURL.toString());
            getMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset="
                                                       + enc);
            //ִ��getMethod
            int statusCode = client.executeMethod(getMethod);
            if (statusCode == HttpStatus.SC_OK) {
                response = getMethod.getResponseBodyAsString();
            } else {
                log.debug("��Ӧ״̬�� = " + getMethod.getStatusCode());
            }
        } catch (HttpException e) {
            log.error("�����������쳣��������Э�鲻�Ի��߷��ص�����������", e);
            e.printStackTrace();
        } catch (IOException e) {
            log.error("���������쳣", e);
            e.printStackTrace();
        } finally {
            if (getMethod != null) {
                getMethod.releaseConnection();
                getMethod = null;
            }
        }

        return response;
    }

    /**
    * ��Map����URL�ַ���
    * @param map
    *             Map
    * @param valueEnc
    *             URL����
    * @return
    *             URL
    */
    private static String getUrl(Map<String, String> map, String valueEnc) {

        if (null == map || map.keySet().size() == 0) {
            return (EMPTY);
        }
        StringBuffer url = new StringBuffer();
        Set<String> keys = map.keySet();
        for (Iterator<String> it = keys.iterator(); it.hasNext();) {
            String key = it.next();
            if (map.containsKey(key)) {
                String val = map.get(key);
                String str = val != null ? val : EMPTY;
                try {
                    str = URLEncoder.encode(str, valueEnc);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                url.append(key).append("=").append(str).append(URL_PARAM_CONNECT_FLAG);
            }
        }
        String strURL = EMPTY;
        strURL = url.toString();
        if (URL_PARAM_CONNECT_FLAG.equals(EMPTY + strURL.charAt(strURL.length() - 1))) {
            strURL = strURL.substring(0, strURL.length() - 1);
        }

        return (strURL);
    }
}
