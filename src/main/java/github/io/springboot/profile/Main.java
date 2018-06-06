package github.io.springboot.profile;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author bang
 * @date 2018/6/6 20:22
 */
//@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
//        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProfileConfig.class);

        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }
}
