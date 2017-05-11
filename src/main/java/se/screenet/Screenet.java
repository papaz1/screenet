package se.screenet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import se.screenet.bean.DemoBean;

@SpringBootApplication
public class Screenet {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(Screenet.class, args);
		DemoBean demoBean = appContext.getBean(DemoBean.class);
        System.out.println(demoBean.sayHello());
    }

}
