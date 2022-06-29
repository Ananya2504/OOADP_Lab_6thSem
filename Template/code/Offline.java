import java.util.*;
public class Offline extends Order {
	Scanner s = new Scanner(System.in);
	int ch;

	protected void selectItem() {
		System.out.println("Offline: Select Items(can also try these items):\n1.Item 1:100 Rs\n2.Item 2:200 Rs");
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
		System.out.println("Offline Payment: Pay cash/Swipe card of "+val+" at Counter");
	}

	protected void doDelivery() {
		System.out.println("Offline Delivery: collect items at the counter");
	}

}