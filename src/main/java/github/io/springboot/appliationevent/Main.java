package github.io.springboot.appliationevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bang
 * @date 2018/6/6 20:57
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
