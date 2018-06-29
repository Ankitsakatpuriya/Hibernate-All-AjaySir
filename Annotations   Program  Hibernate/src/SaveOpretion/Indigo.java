package SaveOpretion;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name ="Flight")
	public class Indigo {
		
		
		@Id
		@Column(name="personid")
		private int personid;
		
		@Column(name="personname")
		private String personename;
		
		@Column(name="Mobileno")
		private int Mobileno;

		public int getPersonid() {
			return personid;
		}

		public void setPersonid(int personid) {
			this.personid = personid;
		}

		public String getPersonename() {
			return personename;
		}

		public void setPersonename(String personename) {
			this.personename = personename;
		}

		public int getMobileno() {
			return Mobileno;
		}

		public void setMobileno(int mobileno) {
			Mobileno = mobileno;
		}
		
		
		
		
		
		
		


	}

