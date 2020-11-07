package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.persistances.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	public void addEmployee(Employee employee) {
		repo.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

}
