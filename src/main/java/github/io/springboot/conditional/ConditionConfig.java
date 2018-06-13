package github.io.springboot.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author bang
 * @date 2018/6/13 22:07
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(SystemCondition.WindowsCondition.class)
    public ListService windowsListService(){
        return new SystemService.WindowsListService();
    }

    @Bean
    @Conditional(SystemCondition.LinuxCondition.class)
    public ListService linuxListService(){
        return new SystemService.LinuxListService();
    }
}
