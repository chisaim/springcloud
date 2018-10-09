package home.pb.springcloud.eurekaribbon.controller;

import home.pb.springcloud.eurekaribbon.service.HelloService;
import home.pb.springcloud.eurekaribbon.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiSaiM
 */
@RestController
public class HelloController {

    @Autowired
    HelloServiceImpl helloServiceimpl;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloServiceimpl.hiService(name);
    }

}
