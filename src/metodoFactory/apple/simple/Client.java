package metodoFactory.apple.simple;

import metodoFactory.apple.simple.factory.IPhoneSimpleFactory;
import metodoFactory.apple.simple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		System.out.println("### Ordering an IPhone X");
		IPhone iphone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an IPhone 11 HighEnd");
		IPhone iphone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(iphone2);
	}
}
