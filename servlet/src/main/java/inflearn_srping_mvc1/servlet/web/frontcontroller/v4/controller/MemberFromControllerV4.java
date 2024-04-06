package inflearn_srping_mvc1.servlet.web.frontcontroller.v4.controller;

import inflearn_srping_mvc1.servlet.web.frontcontroller.ModelView;
import inflearn_srping_mvc1.servlet.web.frontcontroller.v3.ControllerV3;
import inflearn_srping_mvc1.servlet.web.frontcontroller.v4.ControllerV4;

import java.util.Map;

public class MemberFromControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
