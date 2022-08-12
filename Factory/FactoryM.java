public class FactoryM {	
	public Customer getInstance(String str) {
		if(str.equalsIgnoreCase("First Time")) {
			return new FTCustomer();
		}
		else if(str.equalsIgnoreCase("Senior")) {
			return new SCCustomer();
		}
		else if(str.equalsIgnoreCase("Regular")) {
			return new RCustomer();
		}
		return null;
	}
}
