package clearanceRequest.glues;

import clearanceRequest.roles.Grantor;
import clearanceRequest.roles.Requestor;
import elements.ports.Glue;
import elements.ports.Role;

public class Glue4 extends Glue{
	
	public Glue4(String name){
		super(name);
	}
	
	public void receiveRequest(Object msg){
		System.out.println("[ENTRY] in glue " + this.name);
		for (Role role : this.getRoles()){
			if (role instanceof Requestor){
				((Requestor) role).receiveRequest(msg);
			}
		}
	}
}