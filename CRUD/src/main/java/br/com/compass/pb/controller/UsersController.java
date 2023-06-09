package br.com.compass.pb.controller;

import br.com.compass.pb.entity.Users;
import br.com.compass.pb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public Users createUser(@RequestBody Users users){
        return userService.createUser(users);
    }

    @GetMapping("/getById/{id}")
    public Users getUserbyId(@PathVariable String id){
        return userService.getUserbyId(id);
    }

    @GetMapping("/all")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping("/update")
    public Users updateUser(@RequestBody Users users){
        return userService.updateUsers(users);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id){
        return userService.deleteUser(id);
    }

    @GetMapping("/usersByName/{name}")
    public List<Users> usersByName (@PathVariable String name){
        return userService.getUsersByName(name);
    }

}
