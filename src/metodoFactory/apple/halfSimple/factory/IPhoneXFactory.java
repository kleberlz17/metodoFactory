package metodoFactory.apple.halfSimple.factory;

import metodoFactory.apple.halfSimple.model.IPhone;
import metodoFactory.apple.halfSimple.model.IPhoneX;
import metodoFactory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory  {
	
	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
