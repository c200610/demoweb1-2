package haupx912.demoweb1.Controller;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import haupx912.demoweb1.UserRegistration.UserRegistration;
import haupx912.demoweb1.model.Course;
import haupx912.demoweb1.model.User;
import haupx912.demoweb1.repository.CourseRepository;
import haupx912.demoweb1.repository.UserRepository;
import haupx912.demoweb1.service.UserService;

@Controller
public class AddCourseController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/addCourse/{username}/{courseId}")
    public String addCourse(@PathVariable("courseId") Long courseId,@PathVariable("username") String username) {
        User userRequest = userService.getInfo(username);
        Optional<User> userTamp = userRepository.findById(userRequest.getId());
        User user = userTamp.get();
        user.setCourses(Arrays.asList(courseRepository.getById(courseId)));
        return "index";
    }
}
