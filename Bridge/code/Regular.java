public class Regular extends Customer{
	
	public void DisplayBill(){
		System.out.println("Regular Customer Bill:");
		d.CalcDiscount(0.12f);
	}
}
