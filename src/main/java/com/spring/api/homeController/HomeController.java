package com.spring.api.homeController;

import com.spring.api.services.StudentService;
import com.spring.api.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private StudentService studentService;

    // Home page
    @GetMapping("/")
    public String home(){
        return "This is home page";
    }

    // Get all students
    @GetMapping("/student")
//    public List<User> getStudents(){
//        return this.studentService.getStudents();
//    }
public String getStudent(){
        return "all Students";
    }
    // Get a single student
    @GetMapping("/student/{studentID}")
    public User getStudent(@PathVariable String studentID){
        return this.studentService.getStudent(Long.parseLong(studentID));
    }
}
