package com.commons.project.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

/**
 * 公共基础控制器类
 * 放置公用组件：如：日志等
 */
@Controller
public class BaseController {
    protected Logger logger= Logger.getLogger(this.getClass());
}
