public class Main {
	public static void main(String[] args) {
		System.out.println("For customer 1");
		Sports2000Facade f=new Sports2000Facade(false, 100);
		f.displayItems();
		f.dispAmount();
		System.out.println("For customer 2");
		Sports2000Facade f2=new Sports2000Facade(true,200);
		f2.displayItems();
		f2.dispAmount();
	}
}
