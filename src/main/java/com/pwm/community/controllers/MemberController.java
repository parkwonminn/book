package com.pwm.community.controllers;


import com.pwm.community.entities.member.UsersEntity;
import com.pwm.community.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "com.pwm.community.controllers.MemberController")
@RequestMapping(value = "/member")
public class MemberController {


    // 직접 값을 참조할 순 없지만 생성자를 통해 값을 참조할 수 있는 MemberService 변수를 초기화 한다.
    //초기 설정을 변경하지 않도록 하기 위함.
    private final MemberService memberService;


    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @RequestMapping(value = "userLogin", method = RequestMethod.GET)
    public ModelAndView getUserLogin(@SessionAttribute(value = UsersEntity.ATTRIBUTE_NAME, required = false) UsersEntity user,
                                     ModelAndView modelAndView) {
        if (user != null) {

            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.setViewName("member/userLogin");
        return modelAndView;
    }

    @RequestMapping(value = "userRegister", method = RequestMethod.GET)
    public ModelAndView getUserRegister(@SessionAttribute(value = UsersEntity.ATTRIBUTE_NAME, required = false)UsersEntity user,
                                        ModelAndView modelAndView) {
        if (user != null) {
            modelAndView.setViewName("redirect:/");
            return modelAndView;
        }
        modelAndView.setViewName("member/userRegister");
        return modelAndView;
    }
}
