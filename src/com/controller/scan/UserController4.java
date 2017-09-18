package com.controller.scan;

import Dao.UserDao;
import com.controller.com.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * Created by Huangliniqng on 2017/9/18.
 */
@Controller
public class UserController4 {
    @Autowired
    private  UserDao userDao;
    @RequestMapping("/lin.action")
    public ModelAndView queryItem1() throws Exception {
        List<User> list=userDao.findAll();
        // 创建modelAndView准备填充数据、设置视图
        ModelAndView modelAndView = new ModelAndView();
        // 填充数据
        modelAndView.addObject("list", list);
        // 视图
        modelAndView.setViewName("hello");
        return modelAndView;
    }

}
