package github.io.springboot.annotation;

import java.lang.annotation.*;

/**
 * 日志注解类
 * @author bang
 * @date 2018/6/5 21:42
 */

@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotaion {
    String value() default "";
}
