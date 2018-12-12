package com.onway.web.controller.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.onway.common.lang.HttpUtils;
import com.onway.common.lang.StringUtils;

public class SmsSenderUtil {
	private static final Logger logger     = Logger.getLogger(SmsSenderUtil.class);

    /*private static final String ACCOUNT    = ConfigrationFactory.getConfigration()
                                               .getPropertyValue("cl.account");

    private static final String PSWD       = ConfigrationFactory.getConfigration()
                                               .getPropertyValue("cl.pswd");

    private static final String URL        = ConfigrationFactory.getConfigration()
                                               .getPropertyValue("cl.url");

    private static final String NEEDSTATUS = ConfigrationFactory.getConfigration()
                                               .getPropertyValue("cl.needstatus");*/
	
	
	public static boolean sendSms() {
		
		try {
            //��������
            Map<String, String> paramsMap = new HashMap<String, String>();
            paramsMap.put("account","vipyoumi8");
            paramsMap.put("pswd", "Youmjr312");
            paramsMap.put("mobile", "18010972281");
            paramsMap.put("msg","��ã���ӭʹ�ö��Ų��ԣ�");
            paramsMap.put("needstatus", "true");

            logger.info("�������ݣ�" + paramsMap.toString());

            //ת������ֵ
            String returnStr = HttpUtils.executePostMethod("https://sapi.253.com/msg/HttpBatchSendSM", "UTF-8", paramsMap);

            System.out.println("1��"+returnStr);
            logger.info(returnStr); //�ɹ�����Success ʧ�ܷ��أ�Faild
 
            // ���ط��ͽ��
            if (StringUtils.isBlank(returnStr)) {
                return false;
            }

            String[] strs = returnStr.split("\n");
            System.out.println("2��"+strs);
            
            String value = "";
            if (StringUtils.isNotBlank(strs[0])) {
                value = strs[0].split(",")[1];
            } else {
                return false;
            }

            return true;

        } catch (Exception e) {
//            logger.error(MessageFormat.format("���ŷ���ʧ��,������Ϣͨ�� phone:{0},content:{1}", new Object[] {
//                    smsModel.getPhone(), smsModel.getContent() }));
            return false;
        }
	}
	public static void main(String[] args) {
	    sendSms();
    }
}
