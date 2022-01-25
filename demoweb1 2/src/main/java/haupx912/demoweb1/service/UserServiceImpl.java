package haupx912.demoweb1.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import haupx912.demoweb1.model.Role;
import haupx912.demoweb1.model.User;
import haupx912.demoweb1.repository.UserRepository;
import haupx912.demoweb1.userregistration.UserRegistration;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistration userRegistration) {
        User user = new User(userRegistration.getFirstName(), userRegistration.getLastName(), userRegistration.getAge(),
                userRegistration.getTel(), userRegistration.getAddress(), userRegistration.getGender(),
                userRegistration.getSchools(), userRegistration.getUserName(), userRegistration.getPassword(),
                Arrays.asList(new Role("user_role")));
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user = userRepository.findByUserName(username);
        if (user == null) {
            log.error("Error when login by username: ", username);
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        // return new
        // haupx912.demoweb1.service.UserInfo(user.getFirstName(),user.getLastName(),user.getAge(),user.getAddress(),user.getGender(),user.getUserName(),user.getPassword(),user.getTel(),user.getSchools(),user.getCourses(),mapRolesToAutherites(user.getRole()));
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                mapRolesToAutherites(user.getRole()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAutherites(Collection<Role> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    @Override
    public User getInfo(String username) {
        return userRepository.findByUserName(username);
    }



}
