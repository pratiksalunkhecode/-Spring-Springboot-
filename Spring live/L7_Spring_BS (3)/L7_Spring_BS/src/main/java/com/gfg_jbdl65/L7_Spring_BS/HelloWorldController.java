package com.gfg_jbdl65.L7_Spring_BS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Test")
public class HelloWorldController {

    @RequestMapping(value = "api")
    public String helloword(){
        return "Test API Works";
    }


}
