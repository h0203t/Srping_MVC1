package inflearn_srping_mvc1.servlet.web.frontcontroller.v3.controller;

import inflearn_srping_mvc1.servlet.web.frontcontroller.ModelView;
import inflearn_srping_mvc1.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFromControllerV3 implements ControllerV3 {
    @Override
    public ModelView process(Map<String, String> paramMap) {
        return new ModelView("new-form");
    }
}
