public class RCustomer extends Customer{
	public RCustomer(String id,String name) {
		super(id,name);
		typeOfCust="Regular Customer";
		this.d=new RCDiscount();
	}
}
