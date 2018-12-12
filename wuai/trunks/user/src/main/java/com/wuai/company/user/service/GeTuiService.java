package com.wuai.company.user.service;

import com.wuai.company.util.Response;

public interface GeTuiService {

    Response createSendGetuiAuth(Integer id, String trystId);

    Response cancelCreateGetuiAuth(Integer id, String trystId);

    Response waitTrystGetuiAuth(Integer id, String trystId);

    Response cancelUserGetuiAuth(Integer id, String trystId);
}
