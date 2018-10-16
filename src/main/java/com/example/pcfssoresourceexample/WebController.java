package com.example.pcfssoresourceexample;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @RequestMapping("/")
    @PreAuthorize("permitAll")
    public String helloWorld(){
        return "Helloworld !!";
    }

    @RequestMapping("/read")
    @PreAuthorize("#oauth2.hasScope('todo.read')")
    public String readMethod(){
        return "Made some read to todo list.";
    }

    @RequestMapping("/write")
    @PreAuthorize("#oauth2.hasScope('todo.write')")
    public String writeMethod(){
        return "Made some write to todo list.";
    }

    @RequestMapping("/admin")
    @PreAuthorize("#oauth2.hasScope('todo.admin')")
    public String adminMethod(){
        return "Made some admin call to todo list.";
    }
}
