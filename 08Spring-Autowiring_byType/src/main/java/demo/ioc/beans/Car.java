package demo.ioc.beans;

public class Car {
	IEngine engine;

	public Car() {
		System.out.println("Car :: 0-param constructor..");
	}

	// =================================================================
	// In byType parameterized constructors will not be invoked/ setter injection
	// will happenF
	/*
	 * public Car(IEngine engine) { System.out.println("Car :: param constructor");
	 * this.engine = engine; }
	 */
	// ==================================================================

//============setter injection============
	public void setEngine(IEngine engine) {
		System.out.println("Car :: setter() method...");
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is ready to drive...");
	}

}
