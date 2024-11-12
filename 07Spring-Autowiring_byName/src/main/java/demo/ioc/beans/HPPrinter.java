package demo.ioc.beans;

public class HPPrinter implements IPrinter {

	@Override
	public void print() {
		System.out.println("Printed by HPPrinter...");
	}

}
