package kz.aitu.bakerywebservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    public String listAllUsers(){
        return "Hello Users!";
    }
}
