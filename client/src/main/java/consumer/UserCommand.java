package consumer;

import com.netflix.hystrix.HystrixCommand;
import org.springframework.web.client.RestTemplate;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/2/5
 * Time：16:39
 */
public class UserCommand extends HystrixCommand<String> {

    private RestTemplate restTemplate;

    public UserCommand(Setter setter,RestTemplate restTemplate){
        super(setter);
        this.restTemplate = restTemplate;
    }

    @Override
    protected String run() throws Exception {
        String str = restTemplate.getForEntity("http://SERVICE1/service",String.class).getBody();
        return str;
    }

    @Override
    protected String getFallback() {
        return "服务器发生故障了！！！";
    }
}
