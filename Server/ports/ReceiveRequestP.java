package ports;

import elements.physicalinterface.ports.SynchronPort;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

/**
 * This class provided an implementation for the ReceiveRequestP class
 * ReceiveRequestP is the required synchron port of the Server
 * @author E096393A
 *
 */
public class ReceiveRequestP extends SynchronPort{
	
	public ReceiveRequestP(String name){
		super(name, InterfaceType.Required, VisibilityType.Public);
	}
	
	public void receiveData(Object msg){
		System.out.println("Entrer dans le port " + this.name);
		setChanged();
		notifyObservers();
	}
}
