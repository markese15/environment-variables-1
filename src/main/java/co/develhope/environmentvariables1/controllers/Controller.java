package co.develhope.environmentvariables1.controllers;

import co.develhope.environmentvariables1.EnvironmentVariables1Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    Environment enviroment;
    @GetMapping
    public String devName(){
   String a= enviroment.getProperty("myCustomProps.authCode");
        String b= enviroment.getProperty("myCustomProps.devName");
        return a + " " + b;
    }
}
