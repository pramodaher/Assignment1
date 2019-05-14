package com.agsft.model;

import java.util.ArrayList;
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
import javax.persistence.Table;


@Entity
@Table
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	@Column
	private String name;
	
	
	 
	 
	/*
	 * @ManyToMany private List<Employee> employee;
	 */
	
	   @ManyToMany(cascade=CascadeType.ALL)  
	    @JoinTable(name="employee_skill", joinColumns=@JoinColumn(name="skill_id"), inverseJoinColumns=@JoinColumn(name="employee_id"))  
	   private List<Employee> employee;
	

	 

	

}
