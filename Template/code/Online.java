import java.util.*;

public class Online extends Order {
	Scanner s = new Scanner(System.in);
	int ch;

	protected void selectItem() {
		System.out.println("Online : Select Items\n1.Item 1 : 100 Rs\n2.Item 2: 200 Rs");
		ch = s.nextInt();
	}

	protected void doPayment() {
		int val;
		if(ch==1) {
			val = 100;
		}
		else {
			val  = 200;
		}
		System.out.println("Online Payment : Do payment of "+val+" through Netbanking");
	}

	protected void doDelivery() {
		System.out.println("Online Delivery: Pay for shipping and provide Delivery address.");
	}

}
