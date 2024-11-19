package demo.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ioc.beans.Motor;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		Motor motor = context.getBean(Motor.class);
		//motor.start();
		motor.work();
		//motor.destroy();
		ConfigurableApplicationContext cctxt = (ConfigurableApplicationContext) context;
		cctxt.close();

	}

}
