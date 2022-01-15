package haupx912.demoweb1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import haupx912.demoweb1.model.Account;
import haupx912.demoweb1.repository.AccountRespository;
import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class AccountService {
    @Autowired
    private AccountRespository accountRespository;
    public void save(Account account){
        accountRespository.save(account);
    }




    

}
