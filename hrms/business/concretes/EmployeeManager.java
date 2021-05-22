package com.hrms.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrms.business.abstracts.EmployeeService;
import com.hrms.hrms.dataAccess.abstracts.EmployeeDao;
import com.hrms.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getEmployeeAll() {
		// TODO Auto-generated method stub
		return this.employeeDao.findAll();
	}

	@Override
	public Employee employeeAdd(Employee employee) {
		// TODO Auto-generated method stub
		return this.employeeDao.save(employee);
	}

}
