package com.commons.project.controller;

import com.commons.project.comm.Const;
import com.commons.project.comm.aop.LoggerManage;
import com.commons.project.model.User;
import com.commons.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户控制类
 */
@Controller
@RequestMapping(value = "/")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    /**
     * 跳转主页面
     * @return
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @LoggerManage(description = "主页面")
    public String index() {
        System.out.println(Const.BASE_PATH + "hws++++++++++");
        logger.info(Const.BASE_PATH + "hws++++++++++");
        List<User> list = userService.getUsers();
        return "index";
    }

    /**
     * 获取所有用户信息
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public String getAllUser() {
        System.out.println(Const.BASE_PATH + "hws++++++++++");
        logger.info(Const.BASE_PATH + "hws++++++++++");
        List<User> list = userService.getUsers();
        return list.toString();
    }
}
