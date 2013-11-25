package glues;

import roles.Called;
import elements.physicalInterface.glues.Glue;
import elements.physicalInterface.roles.Role;

/**
 * 
 * @author Niiner-PC
 *
 */
public class Glue1 extends Glue{
	
	/**
	 * 
	 * @param name
	 */
	public Glue1(String name){
		super(name);
	}
	
	/**
	 * 
	 * @param msg
	 */
	public void receiveRequest(Object msg){
		System.out.println("[ENTRY] in glue " + this.name);
		for (Role role : this.getRoles()){
			if (role instanceof Called){
				((Called) role).receiveRequest(msg);
			}
		}
	}
}
