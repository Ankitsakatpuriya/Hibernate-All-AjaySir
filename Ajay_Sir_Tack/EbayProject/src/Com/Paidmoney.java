package Com;

import java.io.Serializable;

public class Paidmoney implements Serializable {

	private int paidmoney_id;
	private String paid_Paymentname;
	private String paid_amount;
	public int getPaidmoney_id() {
		return paidmoney_id;
	}
	public void setPaidmoney_id(int paidmoney_id) {
		this.paidmoney_id = paidmoney_id;
	}
	public String getPaid_Paymentname() {
		return paid_Paymentname;
	}
	public void setPaid_Paymentname(String paid_Paymentname) {
		this.paid_Paymentname = paid_Paymentname;
	}
	public String getPaid_amount() {
		return paid_amount;
	}
	public void setPaid_amount(String paid_amount) {
		this.paid_amount = paid_amount;
	}
	
	
	
	
}
