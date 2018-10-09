package home.pb.springcloud.eurekafeign.service.impl;

import home.pb.springcloud.eurekafeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @author ChiSaiM
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
