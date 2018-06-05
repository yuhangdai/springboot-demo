package github.io.springboot.service;

import org.springframework.stereotype.Service;

/**
 * @author bang
 * @date 2018/6/5 20:57
 */
//@Service
public class FunctionService {
    public String sayHello(String str){
        return "Hello "+str+" !";
    }
}
