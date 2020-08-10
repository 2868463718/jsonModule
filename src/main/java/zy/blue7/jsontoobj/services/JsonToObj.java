package zy.blue7.jsontoobj.services;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import zy.blue7.jsontoobj.handlers.Handler;

/**
 * @author blue7
 * @date 2020/8/10 14:33
 **/
@Component
public class JsonToObj<T> {
    private  Handler<T> handler;
    JsonToObj(){
        this.handler=new Handler<T>();
    }
    public  T start( String classFullName,String jsonStr,Environment environment){
        return (T) handler.handle(classFullName,jsonStr,environment);
    }
}
