package com.app.service;

import java.util.List;

import com.app.pojos.Company;
import com.app.pojos.Employee;

public interface EmployeeService {
	public String addEmployee(Employee employee);

	public List<Employee> displayEmployee();

	public List<Employee> findByCompany(Company myCourse);
}
