package hibernate.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@Column(name="PERSON_ID")
	private int id; // never EVER use "id" (or any reserved word) in your database
	//1-1... foreign key + unique
	
	//Lazy by default Eager fetch right away 
	@OneToOne(cascade=CascadeType.REMOVE, fetch=FetchType.EAGER) 
	private Laptop laptop; //1-1 relationship
	
	
	//create a pencil, set the owner, save to DB
	//set auto update
	//1-m(this class->that class)
	@OneToMany(mappedBy="owner") 
	private Set<Pencil> pencils= new HashSet<Pencil>();
	
	//M-M
	@ManyToMany(fetch=FetchType.EAGER )
	@JoinTable(name="PERSON_SKILL")
	private Set<Person> skills;
	
	

}
