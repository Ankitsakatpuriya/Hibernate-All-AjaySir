package inheritance_annotation_1;
import javax.persistence.*;

 

import javax.persistence.*;  

@Entity  
@DiscriminatorValue("regularemployee")  
public class Regular_Employee extends Employeee{  
      
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