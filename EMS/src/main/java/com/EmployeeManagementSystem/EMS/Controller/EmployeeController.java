package com.EmployeeManagementSystem.EMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import com.EmployeeManagementSystem.EMS.Entity.Employee;
import com.EmployeeManagementSystem.EMS.Service.EmployeeService;

import java.util.*;

@Controller
public class EmployeeController {

     @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/employee")
    public String getEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employee"; // This will map to employee.html
    }

    @PostMapping("/employee/add")
    public String addEmployee(Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/employee"; // Redirect to employee page to see the updated list
    }
    
}
