package com.commons.project.comm.exception;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局Exception拦截Handler by vision 2018/5/18
 * 待验证
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public Logger logger=Logger.getLogger(GlobalExceptionHandler.class);
    public static final String DEFAULT_ERROR_VIEW = "error1";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(Exception e, HttpServletRequest request)throws Exception {
        ModelAndView mv=new ModelAndView();
//        if(e instanceof Exception){
//            mv.setViewName();
//        }
        System.out.println("请求地址："+ request.getRequestURL());
        logger.info("请求地址："+ request.getRequestURL());
        logger.info("异常信息",e);
        mv.setViewName("errorjjj");
        return mv;
    }
}
