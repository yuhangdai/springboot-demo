package github.io.springboot.service;

import github.io.springboot.annotation.LogAnnotaion;
import org.springframework.stereotype.Service;

/**
 * @author bang
 * @date 2018/6/5 21:45
 */
@Service
public class AnnotationDemoService {
    @LogAnnotaion(value = "add")
    public void add(){

    }
}
