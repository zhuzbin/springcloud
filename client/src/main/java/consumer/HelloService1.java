package consumer;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Future;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/5
 * Time：16:44
 */
@Service
public class HelloService1 {

    @Autowired
    private RestTemplate restTemplate;

    public String str() throws Exception{
        Future<String> stringFuture = new UserCommand(HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("")),restTemplate).queue();
        String strs = stringFuture.get();
        return strs;
    }
}
