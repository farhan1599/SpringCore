package demo.ioc.beans;

public class Motor {

	public Motor() {
		System.out.println("Motor :: constructor...");
	}
	
	public void start() {
		System.out.println("Motor started...");
	}
	
	public void work() {
		System.out.println("Motor is running...");
	}
	
	public void destroy() {
		System.out.println("Motor stopped...");
	}
	
}
