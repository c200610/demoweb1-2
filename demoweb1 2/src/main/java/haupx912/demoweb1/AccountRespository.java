package haupx912.demoweb1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@ Repository
public interface AccountRespository extends JpaRepository<Account,Long>{
    Account findByUserName(String userName);
}
