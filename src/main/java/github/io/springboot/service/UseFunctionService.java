package github.io.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bang
 * @date 2018/6/5 21:02
 */
@Service
public class UseFunctionService {
    @Autowired
    private FunctionService functionService;

    public void sayHello(String str){
        System.out.println(functionService.sayHello(str));
    }
}
