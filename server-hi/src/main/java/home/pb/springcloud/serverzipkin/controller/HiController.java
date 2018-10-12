package home.pb.springcloud.serverzipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ChiSaiM
 */
@RestController
public class HiController {

    private static final Logger LOGGER = Logger.getLogger(HiController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHome(){
        LOGGER.log(Level.INFO,"calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8989/miya",String.class);
    }

    @RequestMapping("/info")
    public String info(){
        LOGGER.log(Level.INFO,"calling trace service-hi");
        return "i'm service-hi";
    }

}
