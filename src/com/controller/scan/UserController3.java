package com.controller.scan;

import com.controller.com.user.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huangliniqng on 2017/9/18.
 */
@Controller
public class UserController3 {
    @RequestMapping("/huang.action")
    public ModelAndView queryItem() {
        // 商品列表
        List<User> list = new ArrayList<User>();
        User user = new User();
        user.setName("联想笔记本");
        user.setPass("456");
        list.add(user);
        // 创建modelAndView准备填充数据、设置视图
        ModelAndView modelAndView = new ModelAndView();
        // 填充数据
        modelAndView.addObject("list", list);
        // 视图
        modelAndView.setViewName("hello");
        return modelAndView;
    }


}
