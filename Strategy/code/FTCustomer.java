public class FTCustomer extends Customer{
	public FTCustomer(String id,String name) {
		super(id,name);
		typeOfCust="First Time Customer";
		this.d=new FTCDiscount();
	}
}
