package haupx912.demoweb1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;
@Data
@Entity
@Table(name = "Account", uniqueConstraints = @UniqueConstraint(columnNames = "user_name"))
public class Account {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")

    private String lastName;
    @Column(name = "user_name")

    private String userName;
    @Column(name = "password")

    private String password;
    @Column(name = "age")

    private Long age;
    @Column(name = "tel")

    private String tel;
    @Column(name = "adress")

    private String address;
    @Column(name = "gender")

    private boolean gender;
    @Column(name = "schools")

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
