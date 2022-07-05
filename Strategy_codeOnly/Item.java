package p3;

public class Item 
{
	String item;
	double price;
	double total;
	int quantity;
	public Item(String item,double price,int quantity)
	{
		this.item=item;
		this.price=price;
		
		this.quantity=quantity;
		this.total=quantity*price;
	}
	public String toString()
	{
		return "Item_Name:"+item+"\nItem_price:"+price+"\nItem_quantity:"+quantity;
	}
}
