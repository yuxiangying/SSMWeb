package com.yxy.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yxy.model.UserInfo;
import com.yxy.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : yuxiangying
 * @version V1.0
 * @Project: SSMWeb
 * @Package com.yxy.controller
 * @Description: TODO
 * @date Date : 2019年05月10日 16:43
 */
@Controller
@RequestMapping("/user")
//@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/showUser.do")
    public void selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //request.setCharacterEncoding("UTF-8");
        //esponse.setCharacterEncoding("UTF-8");
        long userId = Long.parseLong(request.getParameter("id"));
        UserInfo userInfo = this.userService.selectUser(userId);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(userInfo));
        response.getWriter().close();
    }
}
