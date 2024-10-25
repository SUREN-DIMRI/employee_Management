package com.EmployeeManagementSystem.EMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagementSystem.EMS.Entity.TL;
import com.EmployeeManagementSystem.EMS.Repository.TLRepository;

@Service
public class TLService {
    @Autowired
    private TLRepository tlRepository;

    // Get all TLs
    public List<TL> getAllTL() {
        return tlRepository.findAll();
    }

    // Add a new TL
    public void addTL(TL tl) {
        tlRepository.save(tl);
    }
}
