package hb1;

public class StudentDTO 
{

		private int id=0;
		private String firstName = null;
		private String lastName = null;
		private String address = null;
		private String logIn = null;
		private String password = null;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getLogIn() {
			return logIn;
		}
		public void setLogIn(String logIn) {
			this.logIn = logIn;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
}