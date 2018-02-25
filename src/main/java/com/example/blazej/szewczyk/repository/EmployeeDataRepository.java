package com.example.blazej.szewczyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.blazej.szewczyk.entity.EmployeeData;

public interface EmployeeDataRepository extends JpaRepository<EmployeeData, Integer> {
	
}
