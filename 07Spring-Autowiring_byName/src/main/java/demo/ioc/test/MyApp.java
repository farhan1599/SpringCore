package demo.ioc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ioc.beans.Atm;

public class MyApp {
	public static void main(String[] args) {
  ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
  Atm atm = context.getBean(Atm.class);
  atm.withdraw();
  
	
	}
}
