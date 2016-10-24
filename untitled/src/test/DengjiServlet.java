package test;

import entity.Dengji;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 2016/10/17.
 */
public class DengjiServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String methodName=request.getParameter("method");
        if(methodName.equals("before")){
            response.sendRedirect("/dengji.jsp");
        }else if(methodName.equals("start")){
            this.startDengji(request, response);
        }
    }

    private void startDengji(HttpServletRequest request, HttpServletResponse response) {
        String reason=request.getParameter("reason");
        String time=request.getParameter("time");
        Dengji dengji=new Dengji();
        dengji.setReason(reason);
        dengji.setDengjiTime(time);
        dengji.setUserId("employee1");


    }


}
