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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id;
	
	@Column
	private String name;
	
	@OneToMany
	private List<Employee> employee=new ArrayList<>() ;
	 
	
	
	

}
