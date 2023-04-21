package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.User;
import ma.ensaj.medisafe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/User")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user){
        return userService.create(user);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam int id){
        userService.delete(id);
    }

    @GetMapping("/get")
    public User getUserById(@RequestParam int id) {
        return userService.findById(id);
    }

    @PostMapping("/update")
    public void updateUser(@RequestBody User new_user){
        User user = userService.findById(new_user.getId());

        userService.update(new_user);
    }

}
