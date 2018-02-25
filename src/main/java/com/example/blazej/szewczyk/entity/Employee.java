package com.example.blazej.szewczyk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int $id;
	
	@NotNull
	@Size(min=3, max=15)
	private String name;
	
	@NotNull
	@Size(min=3, max=20)
	private String surname;
	
	@NotNull
	@Size(min=5, max=30)
	private String address;
	
	@NotNull
	@Size(min=4, max=20)
	private String city;
	
	@NotNull
	@Size(min=5, max=45)
	@Column(unique=true)
	private String username;
	
	@NotNull
	@Size(min=8)
	private String password;
	
	@NotNull
	private int privilage;
	
	@NotNull
	@Size(min=5)
	private String position;
	
	@NotNull
	private String salary;
	
	@NotNull
	private String project_asigned;
	
	@NotNull
	private String manager_id;
	
	//empty constructor
	public Employee()	{
		
	}
	
	public Employee(String name, String surname, String address, String city, String username,
			String password, int privilage, String position, String salary, String project_asigned, String manager_id) {
		
		super();
		this.setName(name);
		this.setSurname(surname);
		this.setAddress(address);
		this.setCity(city);
		this.setUsername(username);
		this.setPassword(password);
		this.setPrivilage(privilage);
		this.setPosition(position);
		this.setSalary(salary); 
		this.setProject_asigned(project_asigned);
		this.setManager_id(manager_id);
	}

	/**
	 * @return the $id
	 */
	public int get$id() {
		return $id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the privilage
	 */
	public int getPrivilage() {
		return privilage;
	}

	/**
	 * @param privilage the privilage to set
	 */
	public void setPrivilage(int privilage) {
		this.privilage = privilage;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the salary
	 */
	public String getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(String salary) {
		this.salary = salary;
	}

	/**
	 * @return the project_asigned
	 */
	public String getProject_asigned() {
		return project_asigned;
	}

	/**
	 * @param project_asigned the project_asigned to set
	 */
	public void setProject_asigned(String project_asigned) {
		this.project_asigned = project_asigned;
	}

	/**
	 * @return the manager_id
	 */
	public String getManager_id() {
		return manager_id;
	}

	/**
	 * @param manager_id the manager_id to set
	 */
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	
	
	
}
