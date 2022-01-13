package haupx912.demoweb1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LoginUser extends Account{
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
}
