package github.io.springboot.scheduledtask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bang
 * @date 2018/6/13 21:52
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);

    }

}
