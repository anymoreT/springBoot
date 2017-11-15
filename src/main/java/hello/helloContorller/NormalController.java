package hello.helloContorller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import hello.property.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class NormalController {
    @Autowired
    private  PropertyUtil config_property ;



    @RequestMapping("/tqq")
    @ResponseBody
    String home() {
        return "Hello World!" + config_property.getUploadFilesUrl();
       // return "Hello World!";
    }

    @RequestMapping("/benhuang")
    @ResponseBody
    String test() {
        return "it is testing!";
    }

}
