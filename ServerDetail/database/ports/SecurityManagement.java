package database.ports;

import elements.ports.SynchronPort;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

public class SecurityManagement extends SynchronPort {

	public SecurityManagement(String name) {
		super(name, InterfaceType.Provided, VisibilityType.Public);
	}
	
	public void receiveRequest(Object msg){
		System.out.println("[ENTRY] in port " + this.name);
		setChanged();
		notifyObservers();
	}

}
