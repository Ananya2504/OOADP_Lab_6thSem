import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Order o;
		System.out.println("Do you want to order online or shop offline? choose 1 or 2 respectively: ");
		int ch=Integer.parseInt(sc.nextLine());
		if(ch==1)
		{
			System.out.println("Online Order:");
			o = new Online();
			o.order();
		}
		else {
			System.out.println("Offline Order:");
			o = new Offline();
			o.order();
		}
		System.out.println("Thank you, Do visit again!");
	}
}
