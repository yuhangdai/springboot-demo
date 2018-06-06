package github.io.springboot.appliationevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author bang
 * @date 2018/6/6 20:45
 */
public class DemoEvent extends ApplicationEvent {

    private String msg;

    public DemoEvent(Object source,String msg){
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
