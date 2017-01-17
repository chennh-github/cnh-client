package com.cnh.mvc.client.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ${Description}
 *
 * @author Administrator
 * @version v1.0.0
 * @since 2017/1/13
 */
@Controller
@RequestMapping("demo")
public class DemoViewController {

    @RequestMapping("index")
    public ModelAndView index () {
        return new ModelAndView("system/demo/index");
    }

}
