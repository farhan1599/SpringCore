package demo.ioc.beans;

public class Car {
	Engine engine;

	public Car() {
		System.out.println("Car ::param-less constructor");
	}

	// ==============constructor injection==============================
	public Car(Engine engine) {
		System.out.println("Car :: param-constructor");
		this.engine = engine;
	}

	// =================== setter injection===========================
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		int status = engine.start();
		if (status >= 1) {
			System.out.println("journey started....");
		} else {
			System.out.println("Engine problem...");
		}
	}

}
