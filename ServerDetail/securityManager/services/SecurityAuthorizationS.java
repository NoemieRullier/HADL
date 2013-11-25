package securityManager.services;

import securityManager.ports.SecurityAuthorization;
import elements.ports.Port;
import elements.ports.Service;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

public class SecurityAuthorizationS extends Service {
	
	public SecurityAuthorizationS(String name){
		super(name, InterfaceType.Provided, VisibilityType.Public);
	}
	
	public void sendRequest(Object msg){
		System.out.println("[ Calling service from SecurityAuthorization to send the request ]");
		SecurityAuthorization usedPort = null;
		for (Port port: this.getUsedPorts()){
			if (port instanceof SecurityAuthorization){
				usedPort = (SecurityAuthorization) port;
			}
		}
		usedPort.receiveRequest(msg);
	}

}
