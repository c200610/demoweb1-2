package haupx912.demoweb1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import lombok.Data;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Long age;
    private String tel;
    private String address;
    private boolean gender;
    private String schools;

    
    public Account() {
    
    }


    public Account(String name, Long age, String tel, String address, boolean gender, String schools) {
        super();
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.address = address;
        this.gender = gender;
        this.schools = schools;
    }

    
}
