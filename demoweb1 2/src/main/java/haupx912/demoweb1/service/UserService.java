package haupx912.demoweb1.service;



import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import haupx912.demoweb1.model.User;
import haupx912.demoweb1.UserRegistration.UserRegistration;

public interface UserService extends UserDetailsService{
    User save(UserRegistration userRegistration);
    User getInfo(String username);
}
