package se.core.bean;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public String sayHello(){
        return "Hello Spring Boot";
    }
}
