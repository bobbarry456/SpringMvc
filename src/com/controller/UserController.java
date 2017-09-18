package com.controller;

import com.controller.com.user.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huangliniqng on 2017/9/18.
 */
public class UserController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        List<User> list=new ArrayList<User>();
        User user=new User();
        user.setName("huanglinqing");
        user.setPass("132465");
        list.add(user);
        //创建modelAndView准备填充数据、设置视图
        ModelAndView modelAndView = new ModelAndView();
        //填充数据
        modelAndView.addObject("list", list);
        //视图
        //指定视图
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
