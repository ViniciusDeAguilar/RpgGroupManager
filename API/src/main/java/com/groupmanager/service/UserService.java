package com.groupmanager.service;

import com.groupmanager.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
        private final UserRepo userRepo;

    //Constructor
    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    // Creates a User

}
