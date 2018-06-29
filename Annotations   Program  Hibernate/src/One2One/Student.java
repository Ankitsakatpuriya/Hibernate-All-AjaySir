package One2One;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="study")
public class Student {

	
	@Id
	@Column(name="id")
	private int studentid;
	
	
	
	@Column
	private String studentname;
	
	
	@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
	 @JoinColumn(name="stu_id",referencedColumnName="id")
	
	private PP p;


	public int getStudentid() {
		return studentid;
	}


	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}


	public String getStudentname() {
		return studentname;
	}


	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}


	public PP getP() {
		return p;
	}


	public void setP(PP p) {
		this.p = p;
	}
	
	
	
	
	
	
	
	
}
