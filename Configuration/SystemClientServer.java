import java.util.Observable;

import containers.Configuration;
import elements.links.AttachmentLink;
import elements.links.Link;
import elements.ports.Port;
import links.A1;
import links.A2;

public class SystemClientServer extends Configuration {
	
	private Client c1;
	private Server s;
	private RPC rpc;
	private A1 a1;
	private A2 a2;
	
	public SystemClientServer(String name){
		super(name);
		c1 = new Client(this, "FlorianPC");
		s = new Server(this, "LaisseLibreCoursATonImagination");
		rpc = new RPC("RPCConnector");
		a1 = new A1("A1", c1.getSendRequestP(), rpc.getCaller());
		a2 = new A2("A2", s.getReceiveRequestP(), rpc.getCalled());
		this.links.add(a1);
		this.links.add(a2);
	}

	public Client getC1() {
		return c1;
	}

	public void setC1(Client c1) {
		this.c1 = c1;
	}

}
