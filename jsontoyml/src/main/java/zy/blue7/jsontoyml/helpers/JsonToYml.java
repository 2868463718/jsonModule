package zy.blue7.jsontoyml.helpers;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;
import zy.blue7.jsontoyml.utils.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author blue7
 * @date 2020/8/10 14:51
 **/
@Component
public class JsonToYml {

    public  void parse(String jsonStr){
        this.parse(JSON.parseObject(jsonStr));
    }

    public  void parse(JSONObject jsonObject){
        StringBuilder stringBuilder=new StringBuilder();
        Set<String> ymlSet=new HashSet<>();
        this.parse1(jsonObject,ymlSet,"");

        for(String str:ymlSet){
            stringBuilder.append(str+"\r\n");
        }

        try {
            FileUtils.writeStringToFile(new File("D:\\idea\\idea2020\\workplace\\jsonToObj\\jsontoyml\\src\\main\\resources\\a.yml"),stringBuilder.toString(),"utf8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuilder.toString());
    }

    private void parse1(JSONObject jsonObject, Set<String> ymlSet, String proPath) {
        for(Map.Entry<String,Object> entry:jsonObject.entrySet()){


            String keyYml="";
            String key=entry.getKey();
            Object obj=entry.getValue();
            String key1=key;
            if(key.contains("@")){
                key=key.replace("@","");
                key1="'"+key1+"'";
            }
            if(!proPath.equalsIgnoreCase("")&&!proPath.isEmpty()){
                keyYml=proPath+"."+StringUtils.toLowerCaseFirstOne(key);
            }else {
                keyYml=StringUtils.toLowerCaseFirstOne(key);
            }
            ymlSet.add(keyYml+": "+key1);
            if(obj instanceof JSONObject){
                this.parse1((JSONObject) obj,ymlSet,keyYml);
            }else if (obj instanceof JSONArray){
                if(((JSONArray) obj).get(0) instanceof JSONObject){
                    this.parse1((JSONObject) ((JSONArray) obj).get(0),ymlSet,keyYml);
                }
            }
        }
    }
}
