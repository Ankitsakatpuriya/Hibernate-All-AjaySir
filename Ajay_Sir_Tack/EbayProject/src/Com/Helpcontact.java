package Com;

import java.io.Serializable;

public class Helpcontact implements Serializable {

	private int Founder_id;
	private String Founder_name ;
	private double Headquarters;
	
	public int getFounder_id() {
		return Founder_id;
	}
	public void setFounder_id(int founder_id) {
		Founder_id = founder_id;
	}
	public String getFounder_name() {
		return Founder_name;
	}
	public void setFounder_name(String founder_name) {
		Founder_name = founder_name;
	}
	public double getHeadquarters() {
		return Headquarters;
	}
	public void setHeadquarters(double headquarters) {
		Headquarters = headquarters;
	}
	
}
