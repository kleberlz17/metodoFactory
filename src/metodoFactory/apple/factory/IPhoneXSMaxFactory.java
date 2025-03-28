package metodoFactory.apple.factory;

import metodoFactory.apple.model.IPhone;
import metodoFactory.apple.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
	
	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
