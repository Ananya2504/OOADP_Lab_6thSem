public class StrategyMain {
	public static void main(String args[]) {
		Customer c1=new RCustomer("rc1", "Betty");
		c1.printBill(100);
		c1=new SCCustomer("sc1", "Jughead");
		c1.printBill(100);
		c1=new FTCustomer("ftc1", "Veronica");
		c1.printBill(100);
	}
}
