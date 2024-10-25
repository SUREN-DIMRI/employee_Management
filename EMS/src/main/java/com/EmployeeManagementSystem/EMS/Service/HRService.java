package com.EmployeeManagementSystem.EMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.EmployeeManagementSystem.EMS.Entity.HR;
import com.EmployeeManagementSystem.EMS.Repository.HRRepository;

@Service
public class HRService {
    
    @Autowired
    private HRRepository hrRepository;

    public List<HR> getALLHR(){
        return hrRepository.findAll();
    }

    public HR addHR(HR hr) {
        return hrRepository.save(hr);
    }

    public HR getHRById(Long id) {
        return hrRepository.findById(id).orElseThrow(() -> new RuntimeException("HR not found"));
    }

    public void updateHR(HR hr) {
        hrRepository.save(hr);
    }

    public void deleteHR(Long id) {
        hrRepository.deleteById(id);
    }
}
