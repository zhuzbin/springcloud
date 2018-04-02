package com.zhuzb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/3/27
 * Time：13:47
 */
@Controller
public class MainController {

    @RequestMapping("/")
    public String page(){
        return "hello";
    }

    /**
     *视图
     * @param model
     * @return
     */
    @RequestMapping("/model")
    public String page3(Model model){
        model.addAttribute("name","seawater");
        return "hello";
    }
}
