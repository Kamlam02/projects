package hibernate.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Pencil {
	
	
	@Id
	@Column
	private int pk;
	@Column
	private int num;
	@Column
	private String brand;
	
	//bi-directional relationship
	//M-1
	@ManyToOne(optional=true)
	@JoinColumn(name="PENCIL_OWNER") // generates the FK column
	private Person owner;

}
