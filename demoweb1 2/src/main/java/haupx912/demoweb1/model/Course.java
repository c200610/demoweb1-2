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

import lombok.Data;

@Data
@Entity
@Table(name = "course", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Course {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "name")
        private String name;
        @Column(name = "price")
        private Long price;
        @Column(name = "author")
        private String author;
        @ManyToMany( cascade = CascadeType.ALL)
        @JoinTable(name = "users_corses", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
        private List<User> users;
        
        public Course() {
        }


        public Course(String name, Long price, String author) {
            super();
            this.name = name;
            this.price = price;
            this.author = author;
        }
}
