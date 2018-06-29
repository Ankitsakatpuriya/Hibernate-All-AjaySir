package str;

import java.util.Date;

public class Item {

	private int IId;
	private String IName;
	private int fId;
	
		private Date created;
		  private Date updated;
		public int getIId() {
			return IId;
		}
		public void setIId(int iId) {
			IId = iId;
		}
		public String getIName() {
			return IName;
		}
		public void setIName(String iName) {
			IName = iName;
		}
		public int getfId() {
			return fId;
		}
		public void setfId(int fId) {
			this.fId = fId;
		}
		public Date getCreated() {
			return created;
		}
		public void setCreated(Date created) {
			this.created = created;
		}
		public Date getUpdated() {
			return updated;
		}
		public void setUpdated(Date updated) {
			this.updated = updated;
		}	
		  
		  
}
