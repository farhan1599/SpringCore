package demo.ioc.beans;

public class Atm {
	IPrinter printer;

//=================================================================     
	// In byName parameterized constructors will not be invoked/ setter injection
	// will happen
	/*
	 * public Atm(IPrinter printer) {
	 * System.out.println("ATM :: param constructor"); this.printer = printer; }
	 */
//==================================================================

//============setter injection==============	
	public void setPrinter(IPrinter printer) {
		System.out.println("ATM setter() method..");
		this.printer = printer;
	}

	public void withdraw() {
		printer.print();
		System.out.println("Withdrawal successful..");
	}

}
