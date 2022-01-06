package haupx912.demoweb1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.Data;
@Data
@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    @Email
    private String password;
    private Long age;
    private String tel;
    private String address;
    private boolean gender;
    private String schools;

    
    public Account() {
    
    }





    public Account(String firstName, String lastName, String userName, String password, Long age, String tel,
            String address, boolean gender, String schools) {
                super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.tel = tel;
        this.address = address;
        this.gender = gender;
        this.schools = schools;
    }


    
}
