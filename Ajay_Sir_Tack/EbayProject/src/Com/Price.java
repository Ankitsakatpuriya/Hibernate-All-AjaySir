package Com;

import java.io.Serializable;
import java.util.Set;

public class Price implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int price_id;
	private long productprice;
	private int productid;
			
	
	

	
	
	

	

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public int getPrice_id() {
		return price_id;
	}
	public void setPrice_id(int price_id) {
		this.price_id = price_id;
	}
	public long getProductprice() {
		return productprice;
	}
	public void setProductprice(long productprice) {
		this.productprice = productprice;
	}

	
	
	}
