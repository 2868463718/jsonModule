package zy.blue7.jsontoclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import zy.blue7.jsontoclass.helpers.MyJsonParser;
import zy.blue7.jsontoclass.interfaces.IMyJsonParser;
import zy.blue7.jsontoclass.services.JsonToClassService;

import javax.naming.CannotProceedException;

@SpringBootApplication
public class JsontoclassApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JsontoclassApplication.class, args);

    }

}
