package com.EmployeeManagementSystem.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EmployeeManagementSystem.EMS.Entity.HR;

public interface HRRepository extends JpaRepository<HR,Long>{
    
}
