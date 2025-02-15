package com.javarush.levchuk.projectgorillazdemo;


import com.javarush.levchuk.projectgorillazdemo.entity.User;
import com.javarush.levchuk.projectgorillazdemo.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Collection;

@WebServlet(value = "/edit-user")
public class EditUserServlet extends HttpServlet {

    private final UserService userService = UserService.USER_SERVICE;


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String stringId = request.getParameter("id");
        long id = Integer.parseInt(stringId);
        User user = userService.get(id).orElseThrow();
        request.setAttribute("user", user);
        request.getRequestDispatcher("WEB-INF/edit-user.jsp").forward(request,response);
    }
}