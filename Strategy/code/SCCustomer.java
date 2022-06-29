public class SCCustomer extends Customer{
	public SCCustomer(String id,String name) {
		super(id,name);
		typeOfCust="Senior Citizen Customer";
		this.d=new SCDiscount();
	}
}