package com.groupmanager.service;

import com.groupmanager.repo.AuthorityRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthorityService {

    private AuthorityRepo authorityRepo;

    // Constructor
    public AuthorityService(AuthorityRepo authorityRepo){
        this.authorityRepo = authorityRepo;
    }
}
