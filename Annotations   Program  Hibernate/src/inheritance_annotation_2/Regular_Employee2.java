package inheritance_annotation_2;

import javax.persistence.*;  

@Entity  
@Table(name="regularemployee103")  
@PrimaryKeyJoinColumn(name="ID")  
public class Regular_Employee2 extends Employee2{  
      
@Column(name="salary")    
private float salary;  
  
@Column(name="bonus")     
private int bonus;

public float getSalary() {
	return salary;
}

public void setSalary(float salary) {
	this.salary = salary;
}

public int getBonus() {
	return bonus;
}

public void setBonus(int bonus) {
	this.bonus = bonus;
}  

}
