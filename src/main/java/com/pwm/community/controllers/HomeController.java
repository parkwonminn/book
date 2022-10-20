package com.pwm.community.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// HomeController 가 하는 역활 : MVC 패턴의 C에 해당하고 사용자의 요청을 처리 한 후 지정된 뷰에 모델 객체를 넘겨주는 역할을 수행한다. (사용자들이 웹 브라우저에서 "URL" 로 요청을 보내면 그 요청을 컨트롤러가 받게 된다.
// 요청에 대한 응답(View)한다.

@Controller(value = "com.book.www.controllers.HomeController")
@RequestMapping(value = "/")
public class HomeController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView getIndex(ModelAndView modelAndView) {
        modelAndView.setViewName("home/index");
        return modelAndView;
    }
}
