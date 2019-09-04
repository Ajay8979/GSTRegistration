package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("employeecontroller")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {

		Employee addEmployee = employeeService.addEmployee(employee);

		if (null != addEmployee) {

			return new ResponseEntity<Employee>(employee, HttpStatus.OK);

		} else {
			return new ResponseEntity<Employee>(employee, HttpStatus.BAD_REQUEST);

		}
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public  Page<Employee> getAllEmployee() {

		List<Employee> customerRegList = employeeService.getAllEmployee();
		return null;
		
	}
	
	
	
}
