import java.util.*;
public class Store extends Subject {

	float discount;
	String name;
	ArrayList<Observer>	ol;
	
	public Store(String name,float discount) {
		this.name=name;
		this.discount=discount;
		ol=new ArrayList<Observer>();
	}
	
	void attach(Observer o) {
		ol.add(o);
		System.out.println("Added Customer "+o+" to Store "+name);
	}

	void detach(Observer o) {
		try {
			ol.remove(ol.indexOf(o));	
			System.out.println("Removed Customer "+o+" from store "+name);
		}
		catch (NullPointerException e) {
			System.out.println("No such Customer called "+o+" in store "+name);
		}
		
	}

	void notifyObservers() {
		for(Observer o:ol)
			o.update(discount);
	}
	
	void setDiscount(String festival,float d) {
		discount=d;
		System.out.println("New Discount Offer on Account of "+festival);
		notifyObservers();
	}

}