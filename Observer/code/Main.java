public class Main{

	public static void main(String[] args) {
		
		Store s1=new Store("Store1", 10);
		Customer c1=new Customer(s1, "Betty");
		Customer c2=new Customer(s1,"Jughead");
		
		s1.setDiscount("Holi", 5);
		
		s1.detach(c2);
		s1.setDiscount("Diwali", 20);
		
		Customer c3=new Customer(s1, "Veronica");
		s1.setDiscount("Ugadi", 15);
	}
}

