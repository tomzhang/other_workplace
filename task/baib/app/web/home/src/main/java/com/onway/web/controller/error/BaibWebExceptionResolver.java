package com.onway.web.controller.error;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.ModelAndView;

import com.onway.web.frameset.smvc.exception.handler.ExceptionHandler;
import com.onway.web.frameset.smvc.util.WebHelper;

/**
 * ��վĬ���쳣������
 * 
 * @author li.hong
 * @version $Id: baibWebExceptionResolver.java, v 0.1 2016��9��2�� ����5:42:38 li.hong Exp $
 */
public class BaibWebExceptionResolver implements ExceptionHandler, Ordered {

    /** logger */
    protected static final Logger logger = Logger.getLogger(BaibWebExceptionResolver.class);

    /** Ĭ���쳣ҳ*/
    private String                errorPage;

    /** web������ */
    private WebHelper             webHelper;

    /**
     * 
     * @see com.yylc.web.frameset.smvc.exception.handler.ExceptionHandler#process(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.web.servlet.ModelAndView, java.lang.Exception)
     */
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response, ModelAndView mv,
                        Exception ex) {
        // TODO ���Ż�
        mv.setViewName(errorPage);
        // mv.addObject(ERROR_MSG, ((baibWebCoreException) ex).getMessage());
    }

    /** 
     * @throws IOException 
     * @see com.yylc.web.frameset.smvc.exception.handler.ExceptionHandler#processJson(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.web.servlet.ModelAndView, java.lang.Exception)
     */
    @Override
    public void processJson(HttpServletRequest request, HttpServletResponse response,
                            ModelAndView mv, Exception ex) {
        // TODO ���Ż�
        /* webHelper.writeJson(response, WebBaseResult.retFailMessage("ϵͳ�쳣,���Ժ�����Ŷ!"),
             DEFAULT_ENCODING);*/

        mv = null;
    }

    /** 
     * @see com.yylc.web.frameset.smvc.exception.handler.ExceptionHandler#support(javax.servlet.http.HttpServletRequest, java.lang.Object, java.lang.Exception)
     */
    @Override
    public boolean support(HttpServletRequest request, Object handler, Exception ex) {
        if (ex != null /*&& (ex instanceof FrontWebCoreException)*/) {
            return true;
        }
        return false;
    }

    /** 
     * @see com.yylc.web.frameset.smvc.exception.handler.ExceptionHandler#logError(java.lang.Exception)
     */
    @Override
    public void logError(Exception ex) {
    }

    /** 
     * @see org.springframework.core.Ordered#getOrder()
     */
    @Override
    public int getOrder() {
        return 0;
    }

    public void setErrorPage(String errorPage) {
        this.errorPage = errorPage;
    }

    public void setWebHelper(WebHelper webHelper) {
        this.webHelper = webHelper;
    }
}
