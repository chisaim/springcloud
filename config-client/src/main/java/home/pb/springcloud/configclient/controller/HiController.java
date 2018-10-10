package home.pb.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiSaiM
 */
@RestController
public class HiController {

    @Value("${foo}")
    private String foo;
    @Value("${democonfigclient.message}")
    private String message;

    @RequestMapping("/hi")
    public String hi(){
        return foo;
    }
    @RequestMapping("/hi2")
    public String hi2(){
        return message;
    }


}
