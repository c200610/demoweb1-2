package haupx912.demoweb1.model;

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

        
        public Course() {
        }


        public Course(String name, Long price, String author) {
            super();
            this.name = name;
            this.price = price;
            this.author = author;
        }
}
