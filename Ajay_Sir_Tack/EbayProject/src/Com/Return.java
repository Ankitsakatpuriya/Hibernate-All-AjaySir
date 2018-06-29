package Com;

import java.io.Serializable;

public class Return implements Serializable{
	
	private int return_id;
	private String return_productname;
	private String return_productno;
	
	public int getReturn_id() {
		return return_id;
	}
	public void setReturn_id(int return_id) {
		this.return_id = return_id;
	}
	public String getReturn_productname() {
		return return_productname;
	}
	public void setReturn_productname(String return_productname) {
		this.return_productname = return_productname;
	}
	public String getReturn_productno() {
		return return_productno;
	}
	public void setReturn_productno(String return_productno) {
		this.return_productno = return_productno;
	}
	
	

}
