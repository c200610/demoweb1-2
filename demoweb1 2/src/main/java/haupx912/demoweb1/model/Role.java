package haupx912.demoweb1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "role")
public class Role {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "first_name")
        private String firstName;
        @Column(name = "last_name")
    
        private String lastName;
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

        public Role(String firstName, String lastName, Long age, String tel, String address, boolean gender,
                String schools) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.tel = tel;
            this.address = address;
            this.gender = gender;
            this.schools = schools;
        }
        public Role() {
        }
        
}
