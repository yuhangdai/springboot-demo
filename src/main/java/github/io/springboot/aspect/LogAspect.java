package github.io.springboot.aspect;

import github.io.springboot.annotation.LogAnnotaion;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import sun.reflect.generics.scope.MethodScope;

import java.lang.reflect.Method;


/**
 * @author bang
 * @date 2018/6/5 21:46
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(github.io.springboot.annotation.LogAnnotaion)")
    public void logPointCut(){

    }

    @After("logPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        LogAnnotaion logAnnotaion = method.getAnnotation(LogAnnotaion.class);
        System.out.println("注解拦截方法名:"+logAnnotaion.value());
    }
}
