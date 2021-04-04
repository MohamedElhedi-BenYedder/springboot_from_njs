package tn.hospital_system_management.springboot_from_njs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hospital_system_management.springboot_from_njs.model.User;
import tn.hospital_system_management.springboot_from_njs.service.UserServiceImpl;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @PostMapping("/signup")
    public boolean signup(@RequestBody @Valid User user)
    {
        return userService.signup(user);
    }
    @PostMapping("/login")
    public User login(@RequestBody @Valid User user)
    {
        return userService.login(user);
    }
    @GetMapping("/getAll")
    public List<User> getAll(){
        return userService.getAll();
    }
    @PostMapping("/register")
    public User create(@RequestBody @Valid User user)
    {
        return userService.create(user);
    }
}
