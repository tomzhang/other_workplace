/**
 * onway.com Inc.
 * Copyright (c) 2016-2016 All Rights Reserved.
 */
package com.onway.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.StringTokenizer;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.onway.baib.common.util.Base64;
import com.onway.baib.core.cache.SysConfigCacheManager;
import com.onway.baib.core.cache.code.CodeGenerateComponent;
import com.onway.common.lang.StringUtils;
import com.onway.web.controller.template.ControllerTemplate;

/**
 * ����������
 * 
 * @author li.hong
 * @version $Id: AbstractController.java, v 0.1 2016��9��2�� ����5:25:30 li.hong Exp
 *          $
 */
public class AbstractController {

	/** logger */

	protected static final String USER_CREDIT_LIMIT_APPLY_EXIT = "���û������ö�������Ѿ�����";

	protected static final String EXCEPTION_MESSAGE = "�����쳣�����Ժ���";

	protected static final String SYS_BUSY = "ϵͳ��æ,���Ժ�����";

	protected static final String UPDATE_MESSAGE = "����Ҫ���������°汾����ʹ�øù���";

	protected static final String ILLEGAL_REQUEST = "�Ƿ�����";

	protected static final String TOKEN_ERROR = "token����ȷ";

	protected static final String USER_ID = "userId";

	protected static final String TOKEN = "token";

	protected static final String APP_TYPE = "appType";

	protected static final String VERSION = "version";

	@SuppressWarnings("unused")
	private static final Logger logger = Logger
			.getLogger(AbstractController.class);

	// *********���е����**********************************************

	@Resource
	protected ControllerTemplate controllerTemplate;

	@Resource
	protected SysConfigCacheManager sysConfigCacheManager;

    @Resource
	protected CodeGenerateComponent codeGenerateComponent;

	// *********���е�client*******************************************

	/** �û���Ϣ��ѯ�ͻ��� */

	/** �û��ֻ�token��Ϣ�����ͻ��� */

	// **********���е�DAO*********************************************
	

	/**
	 * ��ȡ�ͻ��˷���ip��ַ
	 * 
	 * @param request
	 * @return
	 */
	public String getIpAddr(HttpServletRequest request) {
		String ip = (String) request.getParameter("loginIP"); // ����PC������IP��¼
		if (StringUtils.isBlank(ip)) {
			ip = request.getHeader("X-Real-IP");
		}
		if (StringUtils.isBlank(ip)) {
			ip = request.getHeader("x-forwarded-for");
		}
		if (StringUtils.isBlank(ip) || ip.length() == 0
				|| "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (StringUtils.isBlank(ip) || ip.length() == 0
				|| "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (StringUtils.isBlank(ip) || ip.length() == 0
				|| "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		return ip;
	}
	
	/*
	 * base64ͼƬ�ϴ�
	 */
     public String uploadBaseImg(String path,String insuranceImg){
//         String baseFile="";
//         for (String s : insuranceImg.split("&")) {
//             if (!StringUtils.contains(s, imgNo)) {
//                 continue;
//             }
//             baseFile = s;
//         }
//         
//         if (baseFile.indexOf(imgNo) != -1) {
//             baseFile = baseFile.replace(imgNo, "");
//         }
//         
         /**
          * Base64 �ϴ�ͼƬ
          */
        Base64 base64 =  new Base64();
            System.out.println(insuranceImg);
            //base64 ����
            byte[] byteArray = base64.decode(insuranceImg);
            // �����쳣����  
            for (byte b : byteArray) {
                if(b<0)
                    b+=256;
            }
            String imageName = this.getImageName();
            try {
                OutputStream out = new FileOutputStream(path+File.separator+imageName);
                out.write(byteArray);
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
          }
        return imageName;
     }
     
     
     /*
      * ��ͼƬ�ϴ�
      */
     public String uploadImgs(String path,String baseFile,String imgPath){
         /**
          * Base64 �ϴ�ͼƬ
          */
        Base64 base64 =  new Base64();
        StringTokenizer st = new StringTokenizer(baseFile,",");
        StringBuilder imageNames=new StringBuilder(); //��ͼƬ�ö��ŷָ�����
         while(st.hasMoreTokens() ){
             String sttoken=st.nextToken();
            System.out.println(sttoken);
            //base64 ����
            byte[] byteArray = base64.decode(sttoken);
            // �����쳣����  
            for (byte b : byteArray) {
                if(b<0)
                    b+=256;
            }
            String imageName = this.getImageName();
            try {
                OutputStream out = new FileOutputStream(path+File.separator+"post"+File.separator+imageName);
                out.write(byteArray);
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            imageNames.append(imgPath+File.separator+"post"+File.separator+imageName);
            imageNames.append(",");
        }
         imageNames.deleteCharAt(imageNames.length()-1); 
         
         return imageNames.toString();
     }
     

  /**
    * ����ϵͳ����õ�ͼƬ����
    */
    public String getImageName(){
        return UUID.randomUUID().toString()+".jpg";
    }



}
