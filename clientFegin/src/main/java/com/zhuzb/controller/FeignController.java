package com.zhuzb.controller;

import com.zhuzb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/2
 * Time：10:37
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/str")
    public String str(){
        return helloService.hello();
    }
}
