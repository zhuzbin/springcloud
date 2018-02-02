package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/1
 * Time：16:34
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService(){
        String str = restTemplate.getForEntity("http://SERVICE1/service",String.class).getBody();
        return str;
    }
}
