package Com;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Brands implements Serializable {

	private int brands_id;
	private String brands_name;
	private int multipleitemsid;
	private Set s3;
	
	
	
	
	public Set getS3() {
		return s3;
	}
	public void setS3(Set s3) {
		this.s3 = s3;
	}
	public int getMultipleitemsid() {
		return multipleitemsid;
	}
	public void setMultipleitemsid(int multipleitemsid) {
		this.multipleitemsid = multipleitemsid;
	}
	public int getBrands_id() {
		return brands_id;
	}
	public void setBrands_id(int brands_id) {
		this.brands_id = brands_id;
	}
	public String getBrands_name() {
		return brands_name;
	}
	public void setBrands_name(String brands_name) {
		this.brands_name = brands_name;
	}
}
