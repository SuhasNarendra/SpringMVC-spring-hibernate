package com.jwt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public void addEmployee(Employee employee) {
		sessionfactory.getCurrentSession().save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> list;
		list = sessionfactory.getCurrentSession().createQuery("FROM Employee").list();
		return list;
	}

	@Override
	public Employee getEmployee(int employeeid) {
		return (Employee) sessionfactory.getCurrentSession().get(Employee.class, employeeid);
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		sessionfactory.getCurrentSession().update(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(int employeeid) {
		Employee employee = (Employee) sessionfactory.getCurrentSession().get(Employee.class, employeeid);

		if (null != employee) {
			sessionfactory.getCurrentSession().delete(employee);
		} else {
			System.out.println("Employee does not exist");
		}

	}

}
