package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.User;
import ma.ensaj.medisafe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(int id){
        return userRepository.findById(id).get();
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public void update(User user){
        userRepository.save(user);
    }

    public void delete(int id){
        userRepository.delete(userRepository.findById(id).get());
    }

    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }
}
