package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yzhao
 * @date 2022-07-28
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/index",params = {"username","username!=admin"})
    public String index(){
        return "index";
    }

    @RequestMapping("/target")
    public String target(@RequestParam("name") String name, String passwd,
                         @RequestHeader("HOST") String host){
        return "target";
    }

    @RequestMapping("/one")
    public String one(HttpServletRequest request){
        request.setAttribute("name","hhhh");
        return "one";
    }

    @RequestMapping("/two")
    public ModelAndView two(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","zhaoyang");
        modelAndView.setViewName("one");
        return modelAndView;
    }

    @RequestMapping("/three")
    public String three(ModelMap map, Model model){
        map.addAttribute("name","jjj");
        return "";
    }
}
