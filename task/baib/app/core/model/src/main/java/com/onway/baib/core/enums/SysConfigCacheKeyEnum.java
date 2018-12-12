package com.onway.baib.core.enums;

import org.apache.commons.lang.StringUtils;

import com.onway.platform.common.enums.EnumBase;

/**
 * ϵͳ����key��ö��
 * 
 * @author guangdong.li
 * @version $Id: SysConfigCacheKeyEnum.java, v 0.1 2015��11��2�� ����3:32:16 liudehong Exp $
 */
public enum SysConfigCacheKeyEnum implements EnumBase {

    /******************************************YUDAO**********************************************/
    INIT_PASSWORD("INIT_PASSWORD", "��ʼ����"),

    MARRAY_CAR_MILEAGE_LIMIT("MARRAY_CAR_MILEAGE_LIMIT", "�鳵���ƹ�����"),

    /******************************************YUDAO**********************************************/
    
    CARD_BIN_VERIFY_FLAG("CARD_BIN_VERIFY_FLAG", "�Ƿ�binУ�鿪��"),

    APP_IOS_GUIDE_IMG("APP_IOS_GUIDE_IMG", "IOS����ҳ���ӵ�ַ"),

    APP_ANDROID_GUIDE_IMG("APP_ANDROID_GUIDE_IMG", "��׿����ҳ���ӵ�ַ"),

    ABOUT_INTRODUCE_INFO("ABOUT_INTRODUCE_INFO", "APP������Ϣ"),

    ABOUT_QQ("ABOUT_QQ", "�ͷ�qqȺ"),

    ABOUT_EMAIL("ABOUT_EMAIL", "�ͷ�����"),

    ABOUT_HOTLINE("ABOUT_HOTLINE", "�ͷ�����"),

    ABOUT_SERVICE_TIME("ABOUT_SERVICE_TIME", "�ͷ�����ʱ��"),

    ABOUT_WEBSITE("ABOUT_WEBSITE", "��վ"),

    ALIPAY_PAY_CALL_BACK_URL("ALIPAY_PAY_CALL_BACK_URL", "֧�����ص���ַ"),

    SHOW_RYT_PRODUCT("SHOW_RYT_PRODUCT", "�Ƿ�չʾRYT��Ʒ"),

    PROD_RECO_ACTIVITY_DESC_FOR_NEW("PROD_RECO_ACTIVITY_DESC_FOR_NEW", "���ֱ���ҳ��Ʒ�Ƽ���İ�"),

    PROD_RECO_ACT_DESC_COLOR_FOR_NEW("PROD_RECO_ACT_DESC_COLOR_FOR_NEW", "���ֱ���ҳ��Ʒ�Ƽ���İ���ɫ"),

    PROD_RECO_ACTIVITY_DESC("PROD_RECO_ACTIVITY_DESC", "�����ֱ���ҳ��Ʒ�Ƽ���İ�"),

    PROD_RECO_ACT_DESC_COLOR("PROD_RECO_ACT_DESC_COLOR", "�����ֱ���ҳ��Ʒ�Ƽ���İ���ɫ"),

    PROD_RECO_SECURITY_DESC("PROD_RECO_SECURITY_DESC", "��ҳ��Ʒ�Ƽ���ȫ�İ�"),

    // ��׿�ͻ������°汾��
    VERSION_APP_ANDROID("VERSION_APP_ANDROID", "��׿�ͻ������°汾��"),

    APP_ANDROID_FORCE_UPDATE("APP_ANDROID_FORCE_UPDATE", "��׿ǿ�Ƹ��±��"),
    // ��׿ǿ�Ƹ��±��
    APP_ANDROID_SHOW_UPDATE("APP_ANDROID_SHOW_UPDATE", "��׿��ʾ������Ϣ���"),
    // ��׿���ص�ַ
    APP_ANDROID_DOWNLOAD_URL("APP_ANDROID_DOWNLOAD_URL", "��׿���ص�ַ"),

    APP_ANDROID_UPDATE_MSG("APP_ANDROID_UPDATE_MSG", "��׿������ʾ��Ϣ"),

    VERSION_APP_IOS("VERSION_APP_IOS", "IOS�ͻ������°汾��"),

    APP_IOS_SHOW_UPDATE("APP_IOS_SHOW_UPDATE", "IOS��ʾ������Ϣ���"),

    APP_IOS_FORCE_UPDATE("APP_IOS_FORCE_UPDATE", "IOSǿ�Ƹ��±��"),

    APP_IOS_UPDATE_MSG("APP_IOS_UPDATE_MSG", "IOS������ʾ��Ϣ"),

    // IOS���ص�ַ
    APP_IOS_DOWNLOAD_URL("APP_IOS_DOWNLOAD_URL", "��׿���ص�ַ"),

    NOTICE_INFO("NOTICE_INFO", "������Ϣ"),

    SIGN_ENTRANCE_URL("SIGN_ENTRANCE_URL", "ǩ�������ַ��Ϣ"),

    /** ͨ������ */
    COMMON_LIMIT_DESC_URL("COMMON_LIMIT_DESC_URL", "ͨ�ý����޶���ַ"),

    yudaoD_BIN_VERIFY_FLAG("yudaoD_BIN_VERIFY_FLAG", "�Ƿ�binУ�鿪��"),

    // ����ͬ������
    BANK_CURRENT_PROFIT("BANK_CURRENT_PROFIT", "���л���ͬ������"),

    DEPOSIT_LIMIT("DEPOSIT_LIMIT", "��ֵ������ͽ��"),

    USER_BANK_LIMIT_DESC("USER_BANK_LIMIT_DESC", "�û������޶�˵���İ�"),

    SYS_TYPE("SYS_TYPE", "���������Ի�������������"),

    APP_VJSON("APP_VJSON", "�ͻ��˴���"),

    SHOW_BUTTON_WITHDRAW("SHOW_BUTTON_WITHDRAW", "�Ƿ�չʾ���ְ�ť"),

    SHOW_BUTTON_DEPOSIT("SHOW_BUTTON_DEPOSIT", "�Ƿ�չʾ��ֵ��ť"),

    SHOW_WITHDRAW_RECORD("SHOW_WITHDRAW_RECORD", "�Ƿ�չʾ���ּ�¼"),

    SHOW_DEPOSIT_RECORD("SHOW_DEPOSIT_RECORD", "�Ƿ�չʾ��ֵ��¼"),

    WITHDRAW_AMOUNT_LIMIT("WITHDRAW_AMOUNT_LIMIT", "�����������"),

    BALANCE_DEF_URL("BALANCE_DEF_URL", "ʲô������URL"),

    DEPOSIT_URL("DEPOSIT_URL", "��ֵҳ��URL"),

    APP_IOS_APPSTORE_TEST("", "appstore�����˺�"),

    GUIDE_IMAGE("", "guideImage��ҳͼƬ"),

    PRE_NOTICE("", "preNotice��ҳͼƬ"),

    PRE_NOTICE_NEW("", "�µ�preNotice��ҳͼƬ"),

    // Ĭ����ʾ�Ļ�����
    @Deprecated
    DEFAULT_FUND_NO("", "Ĭ����ʾ����������"),

    // ӯӯ��Ƶĺ����̻�ID
    YYLC_HW_CORP_NO("", "ӯӯ��Ƶĺ����������"),

    FUND_DIVIDEND_TITLE("", "����ֺ�����"),

    /** �������� */
    FEEDBACK_PARSE_DATE("", "���������ļ�����ʱ��"),

    /** ��Ϣ������� */
    MSG_NEW_USER_AUTO("", "���û���Ϣ����"),

    // �깺��ɱ�ʾ ���������
    MSG_PURCHASE_AUTO("", "�깺�����Ϣ����"),

    // �����ɱ�ʾ ���������
    MSG_REDEEM_AUTO("", "��������Ϣ����"),

    MSG_SMS_VERIFY_CONTENT("", "�ֻ���֤����"),

    // �ֻ���֤��ģ����
    MSG_$0_TEMPLATE("", "�ֻ���֤��ģ��"),

    MSG_SMS_TRANS_CONTENT("", "����ת������"),

    MSG_USER_PROFIT("", "������Ϣ"),

    MIN_USER_PROFIT("", "������Ϣ��ֵ"),

    //
    MSG_SHARE_CONTENT("", "ת������"),

    MSG_COMMON_CONTENT("", "ͨ��ת������"),

    TEMPLATE_URL("", "���ҳ����Դ��ַ"),

    YYLC_PWD_SET_URL("", "ӯӯ�����������ҳ��URL"),

    YYLC_TRADE_PWD_URL("", "ӯӯ��ƽ�������ҳ��URL"),

    YYLC_GET_BACK_PAY_PWD_URL("", "ӯӯ����һؽ�������ҳ��URL"),

    IOS_APNS_SWITCH("", "IOS���ͷ��񿪹�����"),

    USER_PROFIT_SWITCH("", "�û�����ͳ�ƿ���"),

    TRADE_DETAIL_DAY_COUNT("", "��ȡ������ϸ��ʷ������"),

    HW_BANK_LIMIT("", "���п������޶�"),

    MORE_RECOMMEND_INFO("", "������λ�Ƽ���Ϣ"),

    APP_RECOMMEND_JSON("", "Ӧ���Ƽ��б�"),

    ABOUT_YY_INTRODUCE_INFO("", "ӯӯ������Ϣ"),

    //����������ϰ汾��֧��,��ô�Ͱ��հ汾���ε�,���ø�ʽ(��ƽ̨������ĸ˳��android,ios,syibam,wp7)��1.0.3.2|1.4.0
    SHOW_NEW_PRODUCT("", "�Ƿ�Ҫչʾ�²�Ʒ"),

    BANK_PAY_LIMIT("", "����֧���޶�"),

    PURCHASE_NOT_VERIFY_LIMIT("", "δ��Ȩ�����޶�"),

    SHOW_PRE_NOTICE("", "�Ƿ�չʾ��ƷԤ��"),

    SHOW_RYT_PRODUCT_CODE("", "�汾��Ӧչʾ����ӯͨ��Ʒ��ţ��汾���¼���"),

    SHOW_RYT_FUND_RECOMMEND("", "�Ƿ�����ҳ�Ƽ�չʾ��ӯ����Ʒ"),

    SHOW_FUND_INFO_ITEMS("", "�Ƿ�������ҳ�϶�չʾ��Ϣ��"),

    SHOW_FUND_PRE_BACK("", "�Ƿ�֧����ʾ��ǰ����"),

    SHOW_BANNER_RECO_LOAN("", "�Ƿ�֧��banner�Ƽ����"),

    SHOW_BANNER_RECO_LOAN_NEW("", "�Ƿ�֧��banner�Ƽ����"),

    SHOW_QUICK_PAY("", "�Ƿ�֧�ֿ��֧��"),

    /** �����õİ汾���ϾͿ���ʾ���컯�������� */
    SHOW_DIFFER_PROFIT_DATA("", "�Ƿ�չʾ���컯����������"),

    MONITOR_EXCEPTION_COUNT("", "���Exception���ֵ�����"),

    PHONE_LIST("", "���ܼ�ر�����Ϣ�ֻ����б�"),

    AUTH_ERROR_COUNT("", "��Ȩ�������"),

    SHOW_DAILY_LIMIT("", "�Ƿ���е����ۼƼ��"),

    FIRST_TRADE_LIMIT_RYT("", "��ӯͨ�״��깺�������"),

    REQUEST_PURCHASE_COUNT_RYT_LIMIT("", "��ӯͨ������"),

    PURCHASE_QUEUE_RYT_SWITCH("", "��ӯͨ���п���"),

    PURCHASE_QUEUE_COUNT_RYT_LIMIT("", "��ӯͨ������󳤶�"),

    ACC_DEFAULT_PAY_CHANNEL("", "�˻�����Ĭ��֧������"),

    GOOGLE_SPEECH_REQUEST_URL("", "�ȸ�����ϵͳ����URL"),

    GOOGLE_SPEECH_REQUEST_KEY("", "�ȸ�����ϵͳ����KEY"),

    P2C_PROFIT_CALC_DESC_URL("", "P2C��������������ӵ�ַ"),

    DEFAULT_FUND_TYPE("", "Ĭ��չʾ�Ĳ�Ʒ����"),

    USER_SHARE_PAGE_TITLE("", "�û�����ҳ�����"),

    USER_SHARE_PAGE_URL("", "�û�����ҳ���ַ"),

    ACCOUNT_INDEX_HOLD_TIP("", "�ҵ�ӯӯ�����ʲ�TIP"),

    ACCOUNT_INDEX_BALANCE_TIP("", "�ҵ�ӯӯ�˻����TIP"),

    NOTIFY_TIME_PERIOD("", "�û�֪ͨʱ���"),

    REPAYMENT_NOTIFY_TITLE("", "�û��ؿ�֪ͨ����"),

    REPAYMENT_NOTIFY_CONTENT("", "�û��ؿ�֪ͨ����"),

    SUPPORT_QUICK_PAY_BANKCODE("", "֧�ֿ��֧��������"),

    NOT_SUPPORT_QUICK_AUTH_BANKCODE("", "��֧�ֿ����֤������"),

    USER_AUTH_LIST_TITLE("", "�û���Ȩ�б�̧ͷ"),

    QUICKPAY_AUTH_SEC_TIP("", "�����֤��ȫ��ʾ�İ�"),

    QUICKPAY_AUTH_RESERVE_TIP("", "�����֤Ԥ����ʾ�İ�"),

    QUICKPAY_LOCK_TIP("", "������п�������ʾ�İ�"),

    QUICKPAY_AUTH_AMOUNT("", "�����֤֧�����"),

    QUICKPAY_CELL_TIP("", "���Ԥ���ֻ�����ʾ�İ�"),

    QUICKPAY_WITHOUT_CELL_TIP("", "���֧��������Ԥ���ֻ����İ�"),

    QUICKPAY_WITHOUT_CELL_POPUP_TIP("", "���֧��������Ԥ���ֻ��ŵ�������İ�"),

    QUICKPAY_NOT_BIND_LIMIT("", "���֧��δ���޶�"),

    ACCOUNT_DEFAULT_FUNDCODE("", "�˻�����Ĭ�ϲ�Ʒ���"),

    yudaoD_QUICK_VERIFY_FLAG("", "�󿨺�����֤������֤����"),

    /** �û�����ַ��*/
    MAX_ADDRESS_AMOUNT("", "�û�����ַ��"),

    APP_INVITE_URL("", "�ҵ�ӯӯ����������"),

    APP_ACTIVITY_BEGIN_TIME("", "Ӫ�����ʼʱ���"),

    APP_ACTIVITY_END_TIME("", "Ӫ�������ʱ���"),

    APP_ACTIVITY_DESC("", "Ӫ����İ�"),

    UNSETTLEMENT_PROFIT_TIPS("UNSETTLEMENT_PROFIT_TIPS", "δ����������ʾ�İ�"),

    //-----------------------֧�����
    
    SUBSCRIPTIONRATE("SUBSCRIPTIONRATE", "����ռ�����ı���"),
    
    DEPOSITRATE("DEPOSITRATE", "Ѻ��ռ�����ı���"),
    
    WE_PAY_APP_ID("WE_PAY_APP_ID", "΢�Ź��ں�֧��appid"),

    WE_PAY_PARTNER_ID("WE_PAY_PARTNER_ID", "΢�Ź��ں�֧��Partner ID"),

    WE_PAY_APP_SECRET_ID("WE_PAY_APP_SECRET_ID", "΢�Ź��ں�֧��APP Secret"),

    WE_PAY_MCH_ID("WE_PAY_MCH_ID", "΢��֧��MCH_ID"),

    WE_APP_PAY_APP_ID("WE_APP_PAY_APP_ID", "΢��APP֧��appid"),

    WE_APP_PAY_PAY_MCH_ID("WE_APP_PAY_PAY_MCH_ID", "΢��APP֧��MCH_ID"),

    WE_APP_PAY_APP_SECRET_ID("WE_APP_PAY_APP_SECRET_ID", "΢��APP֧��APP Secret"),

    WE_APP_PAY_PARTNER_ID("WE_APP_PAY_PARTNER_ID", "΢��APP֧��Partner ID"),

    ALIPAY_PARTNER("ALIPAY_PARTNER", "֧����֧��partner"),

    ALIPAY_SELLER("ALIPAY_SELLER", "֧����֧��seller"),

    ALIPAY_PRIVATE_KEY("ALIPAY_PRIVATE_KEY", "֧����֧��privateKey"),

    WECHAT_PAY_CALL_BACK_URL("WECHAT_PAY_CALL_BACK_URL", "΢��֧���ص���ַ"),

    WECHAT_PAY_CALL_AUTH_URL("WECHAT_PAY_CALL_AUTH_URL", "΢��֧����Ȩ��ַ"),

    //--------------------Э��---------------------------------
    PROTOCOL_REGISTER("PROTOCOL_REGISTER", "ע��Э��"),

    PROTOCOL_PAY("PROTOCOL_PAY", "ע��Э��"),

    NEW_VERSION("NEW_VERSION", "�汾��"),

    ONLINERESCUE("ONLINERESCUE", "���߾�Ԯ"),

    ENTERPRISE_NEW_VERSION("ENTERPRISE_NEW_VERSION", "��ҵ��app�汾��")

    ;

    /** ö����*/
    private String code;

    /** ������Ϣ*/
    private String message;

    private SysConfigCacheKeyEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /** 
     * @see com.onway.platform.common.enums.EnumBase#message()
     */
    @Override
    public String message() {
        return message;
    }

    /** 
     * @see com.onway.platform.common.enums.EnumBase#value()
     */
    @Override
    public Number value() {
        return null;
    }

    /**
     * ͨ��ö��<code>code</code>���ö�١�
     * 
     * @param code         ö�ٱ��
     * @return
     */
    public static SysConfigCacheKeyEnum getByCode(String code) {

        for (SysConfigCacheKeyEnum param : values()) {
            if (StringUtils.equals(param.getCode(), code)) {
                return param;
            }
        }

        return null;
    }
}
