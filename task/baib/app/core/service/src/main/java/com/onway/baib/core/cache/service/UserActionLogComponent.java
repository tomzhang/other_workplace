package com.onway.baib.core.cache.service;

import com.onway.common.enums.UserLogActionEnum;

public interface UserActionLogComponent {

    /**
     * �û�������־����
     *
     * @param actionEnum
     * @param ip
     * @param userId
     * @param token
     * @param res
     */
    public void publishUserActionLog(UserLogActionEnum actionEnum, String ip, String userId,
                                     String token, boolean res);
}
