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
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import lombok.Data;
@Validated
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

        @Column(name = "address")
        private String address;

        @Column(name = "gender")
        private String gender;

        @Column(name = "schools")
        private String schools;
        @NotNull
        @Column(name = "user_name")
        private String userName;
        @NotNull
        @Column(name = "password")
        private String password;

        @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
        private Collection<Role> role;

        @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        @JoinTable(name = "user_corse", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "course_id", referencedColumnName = "id"))
        private Collection<Course> courses;
        public User() {
        }

        public User(String firstName, String lastName, Long age, String tel, String address, String gender,
                        String schools, String userName, String password, Collection<Role> role) {
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
                this.role = role;
        }

        public User(String firstName, String lastName, Long age, String tel, String address, String gender,
                        String schools, String userName, String password, Collection<Role> role,
                        Collection<Course> courses) {
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
                this.role = role;
                this.courses = courses;
        }
        

}
