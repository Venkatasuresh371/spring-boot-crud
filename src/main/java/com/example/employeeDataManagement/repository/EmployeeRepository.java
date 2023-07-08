package com.example.employeeDataManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeDataManagement.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> 
{
	Optional<Employee> findByName(String name);
}