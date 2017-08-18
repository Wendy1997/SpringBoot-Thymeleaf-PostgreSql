package wendy.damar.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller{

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/jancuk")
    public String welcome2(Map<String, Object> model) {
        model.put("message", "telolet");
        if(model.get("name") == null){
            return "welcome";
        }
        else{
            return "welcome2";
        }
    }
}