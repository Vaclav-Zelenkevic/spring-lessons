package lt.vtmc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("application-context.xml");
		ServiceA service1 = (ServiceA) context.getBean("serviceA");
		ServiceA service2 = (ServiceA) context.getBean("serviceA");
		System.out.println(service1.toString());
		System.out.println(service2.toString());
		
	}
}
