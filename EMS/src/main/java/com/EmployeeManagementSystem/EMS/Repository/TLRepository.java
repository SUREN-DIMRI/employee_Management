package com.EmployeeManagementSystem.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.EmployeeManagementSystem.EMS.Entity.TL;

public interface TLRepository extends JpaRepository<TL,Long> {
    
}
