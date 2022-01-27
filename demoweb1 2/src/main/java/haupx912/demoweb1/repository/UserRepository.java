package haupx912.demoweb1.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import haupx912.demoweb1.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(String userName);

}
