package github.io.springboot.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author bang
 * @date 2018/6/13 21:40
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(int i){
        System.out.println("执行异步任务 "+i);
    }

    @Async
    public void executeAsyncTaskPlus(int i){
        System.out.println("执行异步任务+1 "+(i+1));
    }
}
