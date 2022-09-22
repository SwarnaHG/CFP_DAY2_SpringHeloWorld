package com.example.user.Controller;

import com.example.user.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
//uc1
public class ControllerUser {
    @GetMapping("/get")
    public String getName() {
        return "Hello from bridgelabz";
    }

//uc2
    @GetMapping("/name")
    public String getFirstName
            (@RequestParam String name) {
        return "hello" + " " + name +"from bridgelabz";
    }
//uc3
    @GetMapping("/input/{firstName}")
    public String getInput
            (@PathVariable String firstName) {
        return "Hello" + " " + firstName;
    }
//uc4
    @PostMapping("/save")
    public String postSave
            (@RequestBody User user) {
        return"welcome to bridgelabz"+" "+user.getFirstName() +" "+user.getLastName() +" from bridgelabz";
}
//uc5
@PutMapping("/put/{firstName}")
    public String putHello(@PathVariable String firstName,@RequestParam(value="lastName") String lastName)
{
    return "Hello" + firstName+ " "+lastName+"from bridgelabz";
}

}
