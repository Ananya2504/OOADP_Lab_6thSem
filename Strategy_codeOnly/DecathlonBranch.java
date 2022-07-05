package p3;
import java.util.*;
public class DecathlonBranch 
{
	Scanner sc=new Scanner(System.in);
	Customer r;
	public DecathlonBranch() 
	{
		while(true)
		{
			System.out.println("Enter type of Customer");
			System.out.println("1.FirstTime \t 2.Regular \t 3.SeniorCitizen");
			System.out.println("Press Any other key to exit ");
			int ch=Integer.parseInt(sc.nextLine());
			switch(ch)
			{
			case 1:r=new FirstTimeCustomer();break;
			case 2:r=new RegularCustomer();break;
			case 3:r=new Seniorcitizen();break;
			default:System.out.println("Thankyou for Visiting!!");
					System.exit(0);break;
			}
		}
	}
}
