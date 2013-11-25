package services;

import elements.physicalinterface.services.Service;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

public class ReceiveRequestS extends Service {
	
	public ReceiveRequestS(String name){
		super(name, InterfaceType.Required, VisibilityType.Public);
	}

}
