package demo.ioc.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ioc.beans.Restaurant;

public class MyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		System.out.println("Choose a payment method (Debit Card/Credit Card/UPI)");
		String payMethod = sc.nextLine();

		if (payMethod.equalsIgnoreCase("upi")) {
			System.out.println("Choose any one plateform (GooglePay/PhonePay/Paytm)");
			String plateform = sc.nextLine();

			if (plateform.equalsIgnoreCase("googlepay")) {
				Restaurant upiRestaurant = context.getBean("upiRestaurant", Restaurant.class);
				upiRestaurant.bill();
				System.out.println("payment method: " + payMethod.toUpperCase() + "-" + plateform);

			} else if (plateform.equalsIgnoreCase("phonepay")) {
				Restaurant upiRestaurant = context.getBean("upiRestaurant", Restaurant.class);
				upiRestaurant.bill();
				System.out.println("payment method: " + payMethod.toUpperCase() + "-" + plateform);

			} else if (plateform.equalsIgnoreCase("paytm")) {
				Restaurant upiRestaurant = context.getBean("upiRestaurant", Restaurant.class);
				upiRestaurant.bill();
				System.out.println("payment method: " + payMethod.toUpperCase() + "-" + plateform);

			} else {
				System.out.println("choose a valid plateform !!");
			}

		} else if (payMethod.equalsIgnoreCase("debit card")) {
			Restaurant debitRestaurant = context.getBean("debitRestaurant", Restaurant.class);
			debitRestaurant.bill();
			System.out.println("payment method: " + payMethod.toUpperCase());

		} else if (payMethod.equalsIgnoreCase("credit card")) {
			Restaurant creditRestaurant = context.getBean("creditRestaurant", Restaurant.class);
			creditRestaurant.bill();
			System.out.println("payment method: " + payMethod.toUpperCase());

		} else {
			System.out.println("Choose a valid payment method..!!");
		}
	}

}
