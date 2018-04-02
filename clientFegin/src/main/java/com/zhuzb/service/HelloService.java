package com.zhuzb.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/4/2
 * Time：10:32
 */
@FeignClient("SERVICE1")
public interface HelloService {

    @RequestMapping("service")
    String hello();
}
