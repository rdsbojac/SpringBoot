package com.ronaldo.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id	/*chave primaria*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*auto incremento da chave primaria gerenciada pelo H2*/	
	private Long id;
	private String name;
	private String email;
	
	@ManyToOne /*Definindo chave estrangeira e relacionamento com tabela departamento*/
	@JoinColumn(name="department_id")
	private Department department;
	
	public User() {	
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
