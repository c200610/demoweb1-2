package haupx912.demoweb1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import haupx912.demoweb1.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
        Course getById(Long id);

}
