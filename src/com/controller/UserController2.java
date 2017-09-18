package com.controller;

import com.controller.com.user.User;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huangliniqng on 2017/9/18.
 */
public class UserController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list=new ArrayList<User>();
        User user=new User();
        user.setName("huangliniqing");
        user.setPass("123465");
        list.add(user);
        // 填充数据
        request.setAttribute("list", list);
        // 视图
        request.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(request, response);


    }
}
