package clearanceRequest.roles;

import elements.physicalinterface.roles.Role;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

public class Requestor extends Role{
	
	public Requestor(String name){
		super(name, InterfaceType.Provided, VisibilityType.Public);
	}
}
