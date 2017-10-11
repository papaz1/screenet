package se.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.core.domain.DomainOjbect;
import se.core.repository.ResourceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Screenet {

    private static final Logger log = LoggerFactory.getLogger(Screenet.class);


    public static void main(String[] args) {
        //ApplicationContext appContext = SpringApplication.run(Screenet.class, args);
        //DemoBean demoBean = appContext.getBean(DemoBean.class);
        //System.out.println(demoBean.sayHello());
        //ScreenetDatabase.createDatabase();
        SpringApplication.run(Screenet.class, args);
    }


    @Bean
    public CommandLineRunner demo(ResourceRepository resourceRepository) {
        return (args) -> {
            resourceRepository.save(new DomainOjbect());
            log.info("Database contents");
            for (DomainOjbect domainOjbect : resourceRepository.findAll()) {
                log.info("Here are the values from the database: " + String.valueOf(domainOjbect.getId()));
            }
        };
    }

}
