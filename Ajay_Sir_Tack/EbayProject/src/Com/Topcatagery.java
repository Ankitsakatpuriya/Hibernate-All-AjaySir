package Com;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Topcatagery implements Serializable {

	
	private int t_id;
	private String catagery;
	private Set<?> child;
	
	
	
	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getCatagery() {
		return catagery;
	}
	public void setCatagery(String catagery) {
		this.catagery = catagery;
	}
	public Set<?> getChild() {
		return child;
	}
	public void setChild(Set<?> child) {
		this.child = child;
	}
	
	
	}
	