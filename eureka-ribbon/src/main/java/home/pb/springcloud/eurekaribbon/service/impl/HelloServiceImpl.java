package home.pb.springcloud.eurekaribbon.service.impl;

import home.pb.springcloud.eurekaribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ChiSaiM
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hiService(String name) {
        return restTemplate.getForObject("http://eureka-client/hi?name=" + name,String.class);
    }
}
