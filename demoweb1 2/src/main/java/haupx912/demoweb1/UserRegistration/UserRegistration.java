package haupx912.demoweb1.UserRegistration;

import javax.persistence.Entity;
import javax.validation.constraints.Pattern;

import lombok.Data;
@Data
public class UserRegistration {
    private String firstName;
    private String lastName;
    private Long age;
    private String tel;
    private String address;
    @Pattern(regexp="^(male|female)$")
    private String gender = "male";
    private String schools;
    private String userName;
    private String password;
    public UserRegistration(String firstName, String lastName, Long age, String tel, String address, String gender,
            String schools, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.tel = tel;
        this.address = address;
        this.gender = gender;
        this.schools = schools;
        this.userName = userName;
        this.password = password;
    }
    public UserRegistration() {
    }

}
