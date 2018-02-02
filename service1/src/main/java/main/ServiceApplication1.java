package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/1
 * Time：14:54
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ServiceApplication1 {
    @GetMapping("/service")
    public String service(){
        return "service1";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication1.class,args);
    }
}
