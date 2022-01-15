package haupx912.demoweb1.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import haupx912.demoweb1.model.Account;
import haupx912.demoweb1.repository.AccountRespository;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AccountService implements UserDetailsService{
    @Autowired
    private AccountRespository accountRespository;
    public void save(Account account){
        accountRespository.save(account);
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRespository.findByUserName(username);

        if(account == null){
            System.out.println(username + "Login fail");
            throw new UsernameNotFoundException(username + " not exist");
        }
        
        return createUserDetails(account);
    }

    public User createUserDetails(Account account){
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(account.getUserName(), account.getPassword(), grantedAuthorities);
    }
    



   



    

}
