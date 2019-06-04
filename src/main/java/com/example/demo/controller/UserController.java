package com.example.demo.controller;



import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("User")
public class UserController {
    @Autowired(required = true)
    private UserMapper userMapper;

    @RequestMapping("checkUser")
    public void checkUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User userResult = userMapper.selectUser(user);
        if (user.getUsername() != null && user.getPassword() != null) {
            response.getWriter().print("欢迎"+user.getUsername()+"!!!!!!!!");
        }else {
            response.getWriter().print("用户名或密码错误");
        }
    }
}
