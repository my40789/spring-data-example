package com.js.web.config;

import com.js.web.controller.MyControllerA;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by JunSheng on 6/29/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = MyControllerA.class)
public class MyServletConfig {

}
