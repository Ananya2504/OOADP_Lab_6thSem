package p3;

import java.util.ArrayList;

public class RegularCustomer implements Customer
{
	ArrayList<Item> c=new ArrayList<Item>();
	double discount;
	public RegularCustomer()
	{
		discount=0.12;
		cart();
		bill();
		
	}
	public void cart() 
	{
		c.add(new Item("Item1",300,10));
		
	}
	public void bill() 
	{
		float total=0;
		for (Item i:c)
		{
			System.out.println(i);
			total+=i.total;
			
		}
		System.out.println("sub total:"+total);
		System.out.println("Discount:"+(total*discount));
		System.out.println("Total:"+total*(1-discount));
	}
}
