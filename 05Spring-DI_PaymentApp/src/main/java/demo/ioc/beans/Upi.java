package demo.ioc.beans;

import java.util.Scanner;

public class Upi implements IPayment {

	@Override
	public double pay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to pay :");
		double amount = sc.nextDouble();
		System.out.println("-".repeat(40));
		if (amount > 0) {
			System.out.println("Payment Successful...");
		} else {
			System.out.println("Please enter a valid amount !!");
		}
		System.out.println(".".repeat(40));
		return amount;

	}

}
