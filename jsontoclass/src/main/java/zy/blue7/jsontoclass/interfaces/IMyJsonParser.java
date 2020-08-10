package zy.blue7.jsontoclass.interfaces;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * @author blue7
 * @date 2020/8/10 14:08
 **/
@Component
public interface IMyJsonParser {
   void parse(String packageRelativePath, String jsonStr) throws Exception;
    void parse(String packageRelativePath, JSONObject jsonObj) throws Exception;
}
