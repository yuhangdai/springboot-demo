package github.io.springboot.appliationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author bang
 * @date 2018/6/6 20:48
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我(bean-DemoListener)收到了bean-DemoPublisher发布的消息:"+msg);
    }
}
