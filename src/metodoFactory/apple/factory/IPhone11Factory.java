package metodoFactory.apple.factory;

import metodoFactory.apple.model.IPhone;
import metodoFactory.apple.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}
	
}
