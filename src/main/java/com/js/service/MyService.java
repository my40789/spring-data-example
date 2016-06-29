package com.js.service;

import com.js.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JunSheng on 6/29/2016.
 */
@Service
public class MyService {

    @Autowired
    UserRepository userRepository;

    public String foo() {
        return userRepository.findOne(1l).getName();
    }
}
