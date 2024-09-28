package com.ghaith.demo.student;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
private  StudentService service ;
@Autowired
 public StudentController (StudentService service) {
        this.service = service;
    }
    @PostMapping
    public Student save(@RequestBody Student student) {return service.save(student);}
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email) {
    return service.findbyemail(email);
    }
    @GetMapping
public List<Student> findallstudent(){
    return service.findallstudent();
}
@PutMapping
 public Student update(@RequestBody  Student student) {return service.update(student);}

@DeleteMapping ("/{email}")
public void delete(@PathVariable String email) {
    service.delete(email);
}

}