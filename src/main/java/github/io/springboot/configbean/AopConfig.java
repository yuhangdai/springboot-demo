package github.io.springboot.configbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author bang
 * @date 2018/6/5 21:52
 */
@Configuration
@ComponentScan("github.io.springboot")
@EnableAspectJAutoProxy
public class AopConfig {
}
