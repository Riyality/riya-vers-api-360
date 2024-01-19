package com.riyavers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table( name = "employee" )
public class Employee {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Long id;

	@Column( name = "first_name" )
	private String firstName;

	@Column( name = "last_name" )
	private String lastName;

	@Column( name = "email", nullable = false )
	private String email;

	@Column( name = "contact" )
	private String contact;
	
	@Column( name = "role" )
	private String role;

	@ManyToOne
	@JoinColumn( name = "branch" )
	private Branch branch;

}
