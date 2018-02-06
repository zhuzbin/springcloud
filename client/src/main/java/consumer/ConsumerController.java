package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/1
 * Time：16:39
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private HelloService1 helloService1;

    @GetMapping(value = "/ribbon")
    public String hello(){
        return helloService.helloService();
    }

    @GetMapping(value = "/ribbon1")
    public String hello1() throws Exception{
        return helloService1.str();
    }
}
