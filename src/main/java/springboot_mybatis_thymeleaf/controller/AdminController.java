package springboot_mybatis_thymeleaf.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author rfx
 * @Date 2019/3/15 10:11
 */
@RequestMapping("")
@Service
public class AdminController {


    @RequestMapping("")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
