package com.EmployeeManagementSystem.EMS.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.EmployeeManagementSystem.EMS.Entity.TL;
import com.EmployeeManagementSystem.EMS.Service.TLService;

@Controller
public class TLController {
    
    @Autowired
    private TLService tlService;

    @GetMapping("/tl")
    public String getTL(Model model) {
        List<TL> tlList = tlService.getAllTL();
        model.addAttribute("tlList", tlList);
        return "tl"; // This will map to tl.html
    }
    
    @PostMapping("/addTL")
    public String addTL(
        @RequestParam("name") String name,
        @RequestParam("department") String department,
        @RequestParam("email") String email
    ) {
        TL newTL = new TL();
        newTL.setName(name);
        newTL.setDepartment(department);
        newTL.setEmail(email);
        tlService.addTL(newTL);
        return "redirect:/tl"; // Redirects back to the TL list page
    }
}
