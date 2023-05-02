package ma.ensaj.medisafe.services;

import ma.ensaj.medisafe.beans.Auth;
import ma.ensaj.medisafe.beans.User;
import ma.ensaj.medisafe.repositories.AuthRepository;
import ma.ensaj.medisafe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthRepository authRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(int id){
        return userRepository.findById(id).get();
    }

    public HashMap<String,String> create(User user){
        HashMap<String,String> response = new HashMap<>();
        try{
            userRepository.save(user);
            response.put("message","done");
            return response;
        }catch (Exception e){
            response.put("message","error");
            return response;
        }

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

    public Object auth(HashMap<String,Object> cord){
        HashMap<String,String> response = new HashMap<>();
        String email =(String) cord.get("email");
        String psswd = (String) cord.get("password");
        String imei = (String) cord.get("imei");
        User user = userRepository.findByEmailAndPassword(email,psswd);
        if(user != null){
            if(authRepository.findByImei(imei) == null){
                authRepository.save(new Auth(user, imei, new Date()));
                return user;
            }
            else
                response.put("message","logout first");
                return response;
        }
        response.put("message","not autorized");
        return response;
    }
    public User getUserByImei(String imei){
        Auth auth = authRepository.findByImei(imei);
        User user = findById(auth.getUser().getId());
        return user;
    }
    public Boolean logout(String imei){
        try {
            Auth auth = authRepository.findByImei(imei);
            authRepository.delete(auth);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
