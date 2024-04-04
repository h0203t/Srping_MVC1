package inflearn_srping_mvc1.servlet.web.frontcontroller.v2.controller;

import inflearn_srping_mvc1.servlet.domain.member.Member;
import inflearn_srping_mvc1.servlet.domain.member.MemberRepository;
import inflearn_srping_mvc1.servlet.web.frontcontroller.MyView;
import inflearn_srping_mvc1.servlet.web.frontcontroller.v1.ControllerV2;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV2 implements ControllerV2 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> members = memberRepository.findAll();

        request.setAttribute("members", members);

        return new MyView("/WEB-INF/views/members.jsp");
    }
}
