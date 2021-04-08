package com.manindra.service;

import java.util.List;

import com.manindra.model.Employee;

public interface IEmployeeService {

	Integer saveEmployee(Employee e);
	List<Employee>getAllEmployee();
	Employee getOneEmployee(Integer id);
	void deleteEmployee(Integer id);
}
