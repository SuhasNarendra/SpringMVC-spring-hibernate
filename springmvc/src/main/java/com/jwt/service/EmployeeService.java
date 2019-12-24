package com.jwt.service;

import java.util.List;

import com.jwt.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	Employee getEmployee(int employeeid);

	List<Employee> getAllEmployees();

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int employeeid);
}
