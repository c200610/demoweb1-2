package haupx912.demoweb1.UserRegistration;



import java.util.Arrays;
import java.util.List;

import haupx912.demoweb1.model.Course;
import haupx912.demoweb1.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistration {
    private Long id;
    private String firstName;
    private String lastName;
    private Long age;
    private String tel;
    private String address;
    private String gender;
    private String schools;
    private String userName;
    private String password;
    private List<Course> courses;

    public User updateUserInfo(User user){
        user.setFirstName(this.firstName);
        user.setLastName(this.lastName);
        user.setAge(this.age);
        user.setTel(this.tel);
        user.setAddress(this.address);
        user.setGender(this.gender);
        user.setSchools(this.schools);
        // user.setPassword(newPassword);
        return user;
    }
    public User updatePass(User user){
        user.setPassword(this.password);
        return user;
    }
    public User addCourse(User user,Course course){
        user.setCourses(Arrays.asList(course));
        return user;
    }
}
