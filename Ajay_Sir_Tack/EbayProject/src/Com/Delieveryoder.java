package Com;

import java.io.Serializable;

import org.hibernate.mapping.PrimaryKey;

@SuppressWarnings("serial")
public class Delieveryoder implements Serializable {

	private int delieveryoder_id;
	private String delieveryperson_name;
	private Paymentoptions pay;
	
	
	
	public Paymentoptions getPay() {
		return pay;
	}
	public void setPay(Paymentoptions pay) {
		this.pay = pay;
	}
	public int getDelieveryoder_id() {
		return delieveryoder_id;
	}
	public void setDelieveryoder_id(int delieveryoder_id) {
		this.delieveryoder_id = delieveryoder_id;
	}
	public String getDelieveryperson_name() {
		return delieveryperson_name;
	}
	public void setDelieveryperson_name(String delieveryperson_name) {
		this.delieveryperson_name = delieveryperson_name;
	}
	
}