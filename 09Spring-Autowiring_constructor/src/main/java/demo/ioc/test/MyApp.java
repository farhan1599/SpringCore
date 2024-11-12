package demo.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import demo.ioc.beans.UserService;

public class MyApp {
	public static void main(String[] args) {
   ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
   UserService userService = context.getBean(UserService.class);
   userService.userRegistration();
	}
}
