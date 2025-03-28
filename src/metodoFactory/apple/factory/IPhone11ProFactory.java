package metodoFactory.apple.factory;

import metodoFactory.apple.model.IPhone;
import metodoFactory.apple.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
	
	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
