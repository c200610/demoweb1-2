package haupx912.demoweb1.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import haupx912.demoweb1.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

   
    // Optional<Course> findById(Long id);
    
    
}
