package com.js.web.controller;

import com.js.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by JunSheng on 6/29/2016.
 */
@RestController
@RequestMapping("/rest/controller")
public class MyControllerA {

    @Autowired
    private MyService myService;

    @RequestMapping("/foo")
    public String foo() {
        return myService.foo();
    }
}
