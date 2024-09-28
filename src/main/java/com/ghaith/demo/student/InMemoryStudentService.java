package com.ghaith.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class InMemoryStudentService implements StudentService{
private final InMemoryStudentDao studentDao;

    public InMemoryStudentService(InMemoryStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student save(Student s) {
        return studentDao.save(s);
    }

    @Override
    public List<Student> findallstudent(){
        return studentDao.findallstudent();
    }

    @Override
    public Student findbyemail(String email) {
        return studentDao.findbyemail(email);
    }

    @Override
    public Student update(Student s) {
        return studentDao.update(s);
    }

    @Override
    public void delete(String email) {
        studentDao.delete(email);
    }
}
