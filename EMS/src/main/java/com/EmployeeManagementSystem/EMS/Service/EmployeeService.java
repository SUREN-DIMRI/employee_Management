package com.EmployeeManagementSystem.EMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagementSystem.EMS.Entity.Employee;
import com.EmployeeManagementSystem.EMS.Repository.EmployeeRepository;

import java.util.*;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll(); // Fetch all employees from the database
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}
