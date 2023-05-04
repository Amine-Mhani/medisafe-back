package ma.ensaj.medisafe.controllers;

import ma.ensaj.medisafe.beans.Tracker;
import ma.ensaj.medisafe.beans.User;
import ma.ensaj.medisafe.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping("/register")
    public  HashMap<String,String>createUser(@RequestBody User user){
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

    @PutMapping("/update")
    public void updateUser(@RequestBody User new_user){
        User user = userService.findUserByEmail(new_user.getEmail());
        new_user.setId(user.getId());

        List<Tracker> remainingTrackers = user.getTrackers().stream().collect(Collectors.toList());
        new_user.setTrackers(remainingTrackers);

        userService.update(new_user);
    }

    @GetMapping ("/{imei}")
    public ResponseEntity<User> getUserByImei(@PathVariable String imei){
        try {
            return new ResponseEntity<User>(userService.getUserByImei(imei), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/login")
    public Object getAuth(@RequestBody HashMap cord){
        return userService.auth(cord);
    }

    @GetMapping("/logout/{imei}")
    public Boolean logout(@PathVariable(value = "imei") String imei){
        return userService.logout(imei);
    }

}
