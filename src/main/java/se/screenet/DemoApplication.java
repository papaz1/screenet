package se.screenet;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);
		DemoBean demoBean = appContext.getBean(DemoBean.class);
        System.out.println(demoBean.sayHello());
    }

}
