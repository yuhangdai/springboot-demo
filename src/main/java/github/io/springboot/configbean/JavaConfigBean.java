package github.io.springboot.configbean;

import github.io.springboot.service.FunctionService;
import github.io.springboot.service.UseFunctionService;
import github.io.springboot.service.UseFunctionService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过java配置bean
 * @author bang
 * @date 2018/6/5 21:18
 */
@Configuration
public class JavaConfigBean {

    //声明此方法返回的是一个spring管理的bean，在其它地方可以直接通过方法名使用此bean对象
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService2 useFunctionService(FunctionService functionService){
        UseFunctionService2 useFunctionService2 = new UseFunctionService2();
        useFunctionService2.setFunctionService(functionService);
        return useFunctionService2;
    }
}
