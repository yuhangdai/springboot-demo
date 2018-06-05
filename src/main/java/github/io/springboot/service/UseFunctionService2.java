package github.io.springboot.service;

/**
 * @author bang
 * @date 2018/6/5 21:22
 */
//此处不需声明为spring bean
public class UseFunctionService2 {
    private FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public void sayHello(String str){
        System.out.println(functionService.sayHello(str));
    }
}
