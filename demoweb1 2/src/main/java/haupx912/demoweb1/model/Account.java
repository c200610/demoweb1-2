package haupx912.demoweb1.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.MapsId;
import javax.persistence.OneToOne;
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
   
    @Column(name = "user_name")

    private String userName;
    @Column(name = "password")

    private String password;

    @OneToOne 
    @MapsId
    private Role role = new Role();;

    
    public Account() {
        super();
    }


    public Account(String userName, String password, Role role) {
        super();
        this.userName = userName;
        this.password = password;
        this.role = role;
    }






    
}
