package Com;

import java.io.Serializable;

public class Offer implements Serializable {

	private int offer_id;
	private String offer_name;
	private long product_price;
	private double offer_discount;
	public int getOffer_id() {
		return offer_id;
	}
	public void setOffer_id(int offer_id) {
		this.offer_id = offer_id;
	}
	public String getOffer_name() {
		return offer_name;
	}
	public void setOffer_name(String offer_name) {
		this.offer_name = offer_name;
	}
	public long getProduct_price() {
		return product_price;
	}
	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}
	public double getOffer_discount() {
		return offer_discount;
	}
	public void setOffer_discount(double offer_discount) {
		this.offer_discount = offer_discount;
	}
	
}
