package pattern;

import java.util.ArrayList;
import java.util.List;

import elements.Glue;
import elements.Properties;
import elements.Role;

public class PrimitivConnector implements IConnectorType {
	
	private String name;
	private List<Properties> properties = new ArrayList<Properties>();
	
	private List<Role> roles = new ArrayList<Role>();
	
	private List<Glue> glues = new ArrayList<Glue>();

}