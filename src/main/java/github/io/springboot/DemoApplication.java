package github.io.springboot;

import github.io.springboot.configbean.AopConfig;
import github.io.springboot.configbean.ConfigBean;
import github.io.springboot.configbean.JavaConfigBean;
import github.io.springboot.service.AnnotationDemoService;
import github.io.springboot.service.UseFunctionService;
import github.io.springboot.service.UseFunctionService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
//		demo1
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
//		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
//		useFunctionService.sayHello("aaaa");
//		context.close();

//		demo2
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigBean.class);
//		UseFunctionService2 useFunctionService = context.getBean(UseFunctionService2.class);
//		useFunctionService.sayHello("aaaa");
//		context.close();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		AnnotationDemoService annotationDemoService = context.getBean(AnnotationDemoService.class);
		annotationDemoService.add();
		context.close();
	}
}
