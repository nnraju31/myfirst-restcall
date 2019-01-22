package com.qastarterkits.restbasedui.controller;

import com.qastarterkits.restbasedui.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.annotations.ApiIgnore;

@Controller
public class StudentController {
    @RequestMapping(value = "sdetails", method = RequestMethod.GET)
    public ModelAndView getSDetails(Student student) {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("results.jsp");
        mv.addObject(student);
        return mv;
    }

    @ApiIgnore
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home.jsp";
    }
}

