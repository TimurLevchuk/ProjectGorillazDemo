package com.javarush.levchuk.projectgorillazdemo;

import java.io.*;
import java.util.Collection;

import com.javarush.levchuk.projectgorillazdemo.entity.User;
import com.javarush.levchuk.projectgorillazdemo.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(value = "/list-user")
public class ListUserServlet extends HttpServlet {

    private final UserService userService = UserService.USER_SERVICE;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        Collection<User> users = userService.getAll();
        request.setAttribute("users", users);
        request.getRequestDispatcher("WEB-INF/list-user.jsp").forward(request,response);
    }
}