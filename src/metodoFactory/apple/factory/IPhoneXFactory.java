package metodoFactory.apple.factory;

import metodoFactory.apple.model.IPhone;
import metodoFactory.apple.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
	
	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
