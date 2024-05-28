package com.luv2code.demo.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {

    //adding codes for the helloworld endpoint
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello SpringWorld";
    }

}
