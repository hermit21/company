package com.example.blazej.szewczyk.entity;

import static org.assertj.core.api.Assertions.contentOf;

public class EmployeeData {
	
	private int id;
	
	private int user_id;
	
	private String id_number;
	
	private int vacation_day;
	
	private String vacation_status;
	
	private String contract_type;
	
	private String date_birth;
	
	private String start_date;
	
	public EmployeeData() {
		
	}
	public EmployeeData(int id, int user_id, String id_number, int vacation_day, String vacation_status,
			String contract_type, String date_birth, String start_date) {
		
		super();
		this.setId(id);
		this.setUser_id(user_id);
		this.setId_number(id_number);
		this.setVacation_day(vacation_day);
		this.setVacation_status(vacation_status);
		this.setContract_type(contract_type);
		this.setDate_birth(date_birth);
		this.setStart_date(start_date);
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the id_number
	 */
	public String getId_number() {
		return id_number;
	}
	/**
	 * @param id_number the id_number to set
	 */
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	/**
	 * @return the vacation_day
	 */
	public int getVacation_day() {
		return vacation_day;
	}
	/**
	 * @param vacation_day the vacation_day to set
	 */
	public void setVacation_day(int vacation_day) {
		this.vacation_day = vacation_day;
	}
	/**
	 * @return the vacation_status
	 */
	public String getVacation_status() {
		return vacation_status;
	}
	/**
	 * @param vacation_status the vacation_status to set
	 */
	public void setVacation_status(String vacation_status) {
		this.vacation_status = vacation_status;
	}
	/**
	 * @return the contract_type
	 */
	public String getContract_type() {
		return contract_type;
	}
	/**
	 * @param contract_type the contract_type to set
	 */
	public void setContract_type(String contract_type) {
		this.contract_type = contract_type;
	}
	/**
	 * @return the date_birth
	 */
	public String getDate_birth() {
		return date_birth;
	}
	/**
	 * @param date_birth the date_birth to set
	 */
	public void setDate_birth(String date_birth) {
		this.date_birth = date_birth;
	}
	/**
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}
	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	
	
}
