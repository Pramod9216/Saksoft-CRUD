package com.emp.service;

import com.emp.model.Employee;

public interface EmployeeService {

	Employee insertEmployee(Employee emp);


	Employee findById(int id);


	void removeEmployee(int id);


	Employee editEmployee(int id, Employee emp);

	

}
