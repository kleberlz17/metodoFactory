package metodoFactory.apple.halfSimple;

import metodoFactory.apple.halfSimple.factory.IPhone11Factory;
import metodoFactory.apple.halfSimple.factory.IPhoneFactory;
import metodoFactory.apple.halfSimple.factory.IPhoneXFactory;
import metodoFactory.apple.halfSimple.model.IPhone;

public class Client {

	public static void main(String[]args) {
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();
		
		System.out.println("### Ordering an IPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);
		
		System.out.println("### Ordering an IPhone 11");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
