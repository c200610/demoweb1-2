package haupx912.demoweb1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import haupx912.demoweb1.model.Account;

@ Repository
public interface AccountRespository extends JpaRepository<Account,Long>{
    Account findByUserName(String userName);
}
