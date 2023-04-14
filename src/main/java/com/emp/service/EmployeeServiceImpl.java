package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.EmployeeDao;
import com.emp.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao dao;

	@Override
	public Employee insertEmployee(Employee emp) {
	return	dao.save(emp);
		
	}

	@Override
	public Employee findById(int id) {
		return  dao.findById(id).get();
	}

	@Override
	public void removeEmployee(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public Employee editEmployee(int id, Employee emp) {
       Employee e1 = dao.findById(id).get();
       
       e1.setFirstName(emp.getFirstName());
       e1.setLastName(emp.getLastName());
       e1.setEmail(emp.getEmail());
       e1.setAge(emp.getAge());
       
       return dao.save(e1);
	}

	
	

		
	

}
