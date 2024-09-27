package student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @GetMapping
public List<Student> findallstudent(){
    return List.of(
            new Student(
             "ghaith",
             "bouabda",
             22,
             LocalDate.now(),
            "kalemni@gmail.com" )
   );
}
}
