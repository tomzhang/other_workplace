package test;

import java.util.HashMap;
import java.util.Map;

/**
 * ԤԼ��̨�������
 * 
 * @author jiaming.zhu
 * @version $Id: UserSubscribeMngTest.java, v 0.1 2016��9��13�� ����3:46:06 zjm Exp $
 */
public class UserSubscribeMngTest {

    public static void main(String[] args) {

        String url = Config.localUrl + "mng/getUserSubscribeList.do";

        Map<String, String> params = new HashMap<String, String>();

        params.put("cStatus", "accpt");
        //        params.put("type", "GZ");

        String response = HttpUtils.URLPost(url, params, "UTF-8");

        System.out.println(response);

    }
}
