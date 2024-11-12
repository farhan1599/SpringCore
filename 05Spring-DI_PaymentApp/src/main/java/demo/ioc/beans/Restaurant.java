package demo.ioc.beans;


public class Restaurant {

	private IPayment payment;

	
	//=====constructor injection========
	public Restaurant(IPayment payment) {
		this.payment = payment;
	}

	public void bill() {
		
		double pay = payment.pay();
		if (pay > 0) {
			System.out.println("---Bill generated---");
			System.out.println("Amount recieved: "+pay+" /-");

		} else {
			System.out.println("Payment failed !!");
		}
	}
}
