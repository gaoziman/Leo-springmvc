package org.javatop.springmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.javatop.springmvc.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-06 21:37
 * @description : 控制器
 */
@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/")
    public String toRegisterPage(){
        return "register";
    }



    @PostMapping("/register1")
    public String register1(HttpServletRequest request){
        // 通过当前请求对象获取提交的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String[] hobbies = request.getParameterValues("hobby");
        String intro = request.getParameter("intro");
        logger.info("username:{}, password:{}, sex:{}, hobbies:{}, intro:{}", username, password, sex, Arrays.toString(hobbies), intro);
        return "success";
    }



    @PostMapping("/register2")
    public String register2(@RequestParam(value="username")
                                 String username,
                             @RequestParam(value="password")
                                 String password,
                             @RequestParam(value="sex")
                                 String sex,
                             @RequestParam(value="hobby")
                                 String[] hobbies,
                             @RequestParam(name="intro")
                                 String intro){
        // 通过当前请求对象获取提交的数据
        logger.info("username:{}, password:{}, sex:{}, hobbies:{}, intro:{}", username, password, sex, Arrays.toString(hobbies), intro);
        return "success";
    }


    @PostMapping("/register3")
    public String register3(User user){
        // 通过当前请求对象获取提交的数据
        logger.info("username:{}, password:{}, sex:{}, hobbies:{}, intro:{}", user.getUsername(), user.getPassword(), user.getSex(), Arrays.toString(user.getHobby()), user.getIntro());
        return "success";
    }

}
