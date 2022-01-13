package haupx912.demoweb1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AccountService {
    @Autowired
    private AccountRespository accountRespository;

    public List<Account> listAll(){
        return accountRespository.findAll();
    }

    public void save(Account account){
        accountRespository.save(account);
    }

    public Account get(Long id){
        return accountRespository.getById(id);
    }
    public void delete(Long id){
        accountRespository.deleteById(id);
    }



    

}
