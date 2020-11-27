package com.bdqn.servlet;

import com.bdqn.dao.impl.StudentImpl;
import com.bdqn.service.impl.StudentBiz;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class LoginServlet extends HttpServlet {

    Map<String,Integer> usermap;

    @Override
    public void init() throws ServletException {
        super.init();
        usermap=new HashMap<String, Integer>();
        this.getServletContext().setAttribute("usermap",usermap);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");

        int r = new StudentBiz().login(uname, pwd);
        if (r>0){
            usermap.put(request.getRemoteAddr(),r);
        }
    }
}
