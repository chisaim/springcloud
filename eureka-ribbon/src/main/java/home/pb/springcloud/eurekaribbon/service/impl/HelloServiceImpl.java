package home.pb.springcloud.eurekaribbon.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import home.pb.springcloud.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ChiSaiM
 */
@Service
public class HelloServiceImpl{

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name, String.class);
    }


    public String hiError(String name) {
        return "hi, " + name + ",sorry,error!";
    }

}
