package com.onway.baib.core.model;

import com.onway.platform.common.enums.PlatformCodeEnum;

public interface Constant {

    final PlatformCodeEnum platformCodeEnum             = PlatformCodeEnum.YD_PLATFORM;

    final String           SYS_DEFAULT_STR              = "-1";

    final String           USER_CREDIT_LIMIT_APPLY_EXIT = "���û������ö�������Ѿ�����";

    final String           EXCEPTION_MESSAGE            = "�����쳣�����Ժ���";

    final String           SYS_BUSY                     = "ϵͳ��æ,���Ժ�����";

    final String           UPDATE_MESSAGE               = "����Ҫ���������°汾����ʹ�øù���";

    final String           ILLEGAL_REQUEST              = "�Ƿ�����";

    final String           USERID_ISNULL                = "�û�IDΪ��";

    final String           TOKEN_ERROR                  = "token����ȷ";

    final String           USER_ID                      = "userId";

    final String           REGISTER_CHANNEL             = "registerChannel";

    final String           TOKEN                        = "token";

    final String           APP_TYPE                     = "appType";

    final String           VERSION                      = "version";

    final String           SIGN_T                       = "sign_t";

    final String           ORDER_STATUS                 = "orderStatus";

    final PlatformCodeEnum YOU_MI                       = Constant.platformCodeEnum;

    final String           SIGN                         = "sign";

    final String           TIME                         = "stime";

    final String           CHECK_CODE                   = "checkCode";

    final String           SIGN_SEED                    = "onway888888";

    final String           PROD_CODE                    = "prodCode";

    final int              PAGE_NUM_DIGIT               = 1;

    final int              PAGE_SIZE_DIGIT              = 10;

    final String           PAGE_NUM                     = "pageNum";

    final String           PAGE_SIZE                    = "pageSize";

    final String           TRANSCODING_ERROR            = "���뷽ʽת���쳣";

    final String           UPLOAD_SUCCESS               = "�ϴ��ɹ�";

    final String           UPLOAD_ERROR                 = "�ϴ��쳣";

    final String           UTF_8                        = "UTF-8";
}
