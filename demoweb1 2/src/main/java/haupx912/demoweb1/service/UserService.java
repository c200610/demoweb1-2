package haupx912.demoweb1.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import haupx912.demoweb1.UserRegistration.UserRegistration;
import haupx912.demoweb1.model.User;

public interface UserService extends UserDetailsService{
    User save(UserRegistration userRegistration);
}
