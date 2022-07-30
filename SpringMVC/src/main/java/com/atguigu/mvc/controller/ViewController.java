package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yzhao
 * @date 2022-07-30
 */
@Controller
public class ViewController {

    @RequestMapping("/testView")
    public String testView(){
        return "test_view";
    }
}
