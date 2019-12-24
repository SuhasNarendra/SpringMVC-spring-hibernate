package com.jwt.dao;

import java.util.List;

import com.jwt.model.Employee;

public interface EmployeeDAO {

	void addEmployee(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployee(int employeeid);

	Employee updateEmployee(Employee employee);

	void deleteEmployee(int employeeid);
}
