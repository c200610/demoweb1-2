package haupx912.demoweb1.userregistration;


import lombok.Data;
@Data
public class UserRegistration {
    private String firstName;
    private String lastName;
    private Long age;
    private String tel;
    private String address;
    private String gender;
    private String schools;
    private String userName;
    private String password;

    public UserRegistration(String firstName, String lastName, Long age, String tel, String address, String gender,
            String schools, String userName, String password) {
                super();
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
