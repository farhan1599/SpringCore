package demo.ioc.beans;

public class Engine {
	public Engine() {
		System.out.println("Engine :: constructor");
	}

	public int start() {
		// some logic
		System.out.println("Engine started......");
		return 1;
	}

}
