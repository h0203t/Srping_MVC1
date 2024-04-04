package inflearn_srping_mvc1.servlet.web.frontcontroller.v2.controller;

import inflearn_srping_mvc1.servlet.web.frontcontroller.MyView;
import inflearn_srping_mvc1.servlet.web.frontcontroller.v1.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberFromControllerV2 implements ControllerV2 {

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        return new MyView("/WEB-INF/views/new-form.jsp");
    }
}
