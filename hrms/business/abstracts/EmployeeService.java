package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.entities.concretes.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployeeAll();
	Employee employeeAdd(Employee employee);

}
