package haupx912.demoweb1;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountDetailServiceImpl implements UserDetailsService{
    private final AccountRespository accountRespository;
 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Account account = accountRespository.findByUsername(username);
		
		if(account == null) {
			System.out.println(username + "Login 失敗");
			throw new UsernameNotFoundException(username + "not found.");
		}
		
		return createUserDetails(account);
	}
	
	public User createUserDetails(Account account) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		return new User(account.getUserName(), account.getPassword(), grantedAuthorities);
	}
}




// full update