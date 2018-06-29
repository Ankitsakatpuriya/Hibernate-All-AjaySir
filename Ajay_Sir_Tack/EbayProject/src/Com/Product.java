package Com;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Product implements Serializable{

	private int product_id;
	private String produts_name;
	private String produts_details;
	private int brandsid;
	private Set<?> s4;
	private Set<?> user;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduts_name() {
		return produts_name;
	}
	public void setProduts_name(String produts_name) {
		this.produts_name = produts_name;
	}
	public String getProduts_details() {
		return produts_details;
	}
	public void setProduts_details(String produts_details) {
		this.produts_details = produts_details;
	}
	public int getBrandsid() {
		return brandsid;
	}
	public void setBrandsid(int brandsid) {
		this.brandsid = brandsid;
	}
	public Set<?> getS4() {
		return s4;
	}
	public void setS4(Set<?> s4) {
		this.s4 = s4;
	}
	public Set<?> getUser() {
		return user;
	}
	public void setUser(Set<?> user) {
		this.user = user;
	}
	
	
	
	
}