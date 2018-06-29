package inheritance_annotation_2;

import javax.persistence.*;  

@Entity  
@Table(name = "employee103")  
@Inheritance(strategy=InheritanceType.JOINED)  
  
public class Employee2 {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  
  
@Column(name = "name")  
private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
} 




}
