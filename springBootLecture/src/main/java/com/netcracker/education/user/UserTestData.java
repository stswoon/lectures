package com.netcracker.education.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserTestData {
    private final UserRepository userRepository;

    @Autowired
    public UserTestData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void initTestData() {
        userRepository.save(new User("admin", "admin")); 
        //in real application password should be encrypted
    }
}
