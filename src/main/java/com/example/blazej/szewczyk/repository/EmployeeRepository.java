package com.example.blazej.szewczyk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.blazej.szewczyk.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e.username, e.password FROM employee e WHERE e.username=:username")
	List <Employee> findByUsername(String $username);
}
