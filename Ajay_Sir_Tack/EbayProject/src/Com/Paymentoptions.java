package Com;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class Paymentoptions implements Serializable {

	private int payment_id;
	private String payment_type;
	
	private int forevenid22;
	
	
	
	
	
	
	public int getForevenid22() {
		return forevenid22;
	}
	public void setForevenid22(int forevenid22) {
		this.forevenid22 = forevenid22;
	}
	public int getPayment_id() {
		return payment_id;
	}
	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	
	
}
