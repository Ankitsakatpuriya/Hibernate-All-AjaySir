package com.aartek.dto;

public class UserDTO {

		private int Id=0;
		private String firstname = null;
		private String lastname = null;
		private String rollno = null;
		private String pincode = null;
		private String City = null;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno = rollno;
		}
		public String getPincode() {
			return pincode;
		}
		public void setPincode(String pincode) {
			this.pincode = pincode;
		}
		public String getCity() {
			return City;
		}
		public void setCity(String city) {
			City = city;
		}}