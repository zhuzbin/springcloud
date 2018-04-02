package consumer;

import com.netflix.hystrix.*;

/**
 * Desc：
 * User：ZhuZhiBin
 * Date：2018/3/29
 * Time：14:06
 */
public class UserCommand1 extends HystrixCommand<String> {

    public UserCommand1() {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("GroupName"))
        .andCommandKey(HystrixCommandKey.Factory.asKey("CommandName"))
        .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("ThreadPoolName")));
    }

    @Override
    protected String run() throws Exception {
        return null;
    }
}
