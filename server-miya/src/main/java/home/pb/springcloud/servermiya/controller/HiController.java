package home.pb.springcloud.servermiya.controller;

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
        LOGGER.log(Level.INFO,"hi is being called");
        return "hi i'm miya!";
    }

    @RequestMapping("/miya")
    public String info(){
        LOGGER.log(Level.INFO,"info is being called");
        return restTemplate.getForObject("http://localhost:8988/info",String.class);
    }

}
