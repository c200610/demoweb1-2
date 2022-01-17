package haupx912.demoweb1.model;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Data
@Table(name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "user_name"))
public class User {
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
        private String gender;

        @Column(name = "schools")
        private String schools;
        @Column(name = "user_name")
        private String userName;

        @Column(name = "password")
        private String password;

        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
        private Collection<Role> role;

        public User(String firstName, String lastName, Long age, String tel, String address, String gender,
                        String schools, String userName, String password, Collection<Role> role) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.tel = tel;
                this.address = address;
                this.gender = gender;
                this.schools = schools;
                this.userName = userName;
                this.password = password;
                this.role = role;
        }

        public User() {
        }

}
