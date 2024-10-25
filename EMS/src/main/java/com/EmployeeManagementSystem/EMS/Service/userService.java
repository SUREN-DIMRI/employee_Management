package com.EmployeeManagementSystem.EMS.Service;

import com.EmployeeManagementSystem.EMS.Entity.user;
import com.EmployeeManagementSystem.EMS.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class userService {
    @Autowired
    private UserRepository userRepository;

    public boolean validateUser(String username, String password) {
        Optional<user> user = userRepository.findByUsername(username);
        if (user.isPresent()) {
            return user.get().getPassword().equals(password);
        }
        return false;
    }
}
