package home.pb.springcloud.consulmiya.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiSaiM
 */
@RestController
public class MiyaController {

    @RequestMapping("/hi")
    public String name(){
        return "hi i'm miya";
    }

}
