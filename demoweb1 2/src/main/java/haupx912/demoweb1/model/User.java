package haupx912.demoweb1.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Validated
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

        @ManyToMany( cascade = CascadeType.ALL)
        @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
        private List<Role> roles;

        @ManyToMany( cascade = CascadeType.ALL)
        @JoinTable(name = "users_corses", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
        private List<Course> courses;
        
        // public User() {
        // }

        public User(String firstName, String lastName, Long age, String tel, String address, String gender,
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

        public void setRoles(java.util.List<Role> asList) {
        }

        // public User(String firstName, String lastName, Long age, String tel, String address, String gender,
        //                 String schools, String userName, String password,Collection<Role> roles, Collection<Course> courses) {
        //                         super();

        //         this.firstName = firstName;
        //         this.lastName = lastName;
        //         this.age = age;
        //         this.tel = tel;
        //         this.address = address;
        //         this.gender = gender;
        //         this.schools = schools;
        //         this.userName = userName;
        //         this.password = password;
        //         this.roles = roles;
        //         this.courses = courses;
        // }
        

}
