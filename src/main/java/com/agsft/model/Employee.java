package com.agsft.model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.Type;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	@Column
	private String name;
	
	@Column(unique=true)
	private String email;
	
	@Column( columnDefinition= "TINYINT")
	@Type(type = "org.hibernate.type.NumericBooleanType")
	private boolean active;
	

	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	
	@Column
	private double salary;
	
	
	  @ManyToOne
	  @JoinColumn(referencedColumnName="id",nullable=false) private Department
	  department;
	 

	
	
	/*
	 * @ManyToMany private List<Skill> Skills;
	 */
	 
	   @ManyToMany(cascade=CascadeType.ALL)  
	    @JoinTable(name="employee_skill", joinColumns=@JoinColumn(name="employee_id"), inverseJoinColumns=@JoinColumn(name="skill_id"))  
	   private List<Skill> Skills;


	


}
