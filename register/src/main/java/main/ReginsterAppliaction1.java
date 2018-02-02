package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/1
 * Time：14:34
 */
@SpringBootApplication
@EnableEurekaServer
public class ReginsterAppliaction1 {
    public static void main(String[] args) {
        SpringApplication.run(ReginsterAppliaction1.class,args);
    }
}
