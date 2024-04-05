package inflearn_srping_mvc1.servlet.web.frontcontroller.v3.controller;

import inflearn_srping_mvc1.servlet.domain.member.Member;
import inflearn_srping_mvc1.servlet.domain.member.MemberRepository;
import inflearn_srping_mvc1.servlet.web.frontcontroller.ModelView;
import inflearn_srping_mvc1.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {

        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        return mv;
    }
}
