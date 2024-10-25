package com.EmployeeManagementSystem.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagementSystem.EMS.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // JpaRepository provides built-in methods for CRUD operations
}