package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.EmployeeDAO;
import com.jwt.model.Employee;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeedao;

	@Override
	public void addEmployee(Employee employee) {
		employeedao.addEmployee(employee);
	}

	@Override
	public Employee getEmployee(int employeeid) {
		return employeedao.getEmployee(employeeid);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeedao.getAllEmployee();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeedao.updateEmployee(employee);
	}

	@Override
	public void deleteEmployee(int employeeid) {
		employeedao.deleteEmployee(employeeid);
	}

}
