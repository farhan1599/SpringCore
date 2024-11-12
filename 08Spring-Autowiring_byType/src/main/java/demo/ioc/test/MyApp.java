package demo.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ioc.beans.Car;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
	Car car = context.getBean(Car.class);
car.drive();
	}

}
