package br.com.compass.pb.service;

import br.com.compass.pb.entity.Users;
import br.com.compass.pb.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UsersRepository usersRepository;

    public Users createUser(Users user){
        return usersRepository.save(user);
    }

    public Users getUserbyId(String id){
        return usersRepository.findById(id).get();
    }

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    public Users updateUsers(Users users){
        return usersRepository.save(users);
    }

    public String deleteUser(String id){
        usersRepository.deleteById(id);
        return "User has been deleted";
    }

    public List<Users> getUsersByName(String name){
        return usersRepository.findByName(name);
    }
}
