public class Main {
	public static void main(String[] args) {
		CalcTax ct=new MTAdapter();
		Item i1 = new Item("cycle",2,100,ct);
		System.out.println("With Mauritius Tax");
		i1.displayItem();
		i1.setTax(new GST());
		System.out.println("\nWith GST");
		i1.displayItem();
	}
}
