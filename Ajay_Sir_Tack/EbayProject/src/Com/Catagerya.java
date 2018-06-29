package Com;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Catagerya implements Serializable {

	private int c_id;
	private String catageryname;
	private int forevenid;
	private Set<?> s1;
	
	
	
	
	
	public Set<?> getS1() {
		return s1;
	}
	public void setS1(Set<?> s1) {
		this.s1 = s1;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getCatageryname() {
		return catageryname;
	}
	public void setCatageryname(String catageryname) {
		this.catageryname = catageryname;
	}
	public int getForevenid() {
		return forevenid;
	}
	public void setForevenid(int forevenid) {
		this.forevenid = forevenid;
	}




}
	