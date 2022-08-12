public class Main {
	public static void main(String[] args) {
		FactoryM f=new FactoryM();
		Customer c1=f.getInstance("first time");
		Customer c2=f.getInstance("regular");
		Customer c3=f.getInstance("Senior");
		c1.printType();
		c2.printType();
		c3.printType();
	}

}