//package com.spring.api.services;
//
//import com.spring.api.DAO.StudentServicesDAO;
//import com.spring.api.user.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class StudentServiceImpl implements StudentService {
//    @Autowired
//    private StudentServicesDAO studentServicesDAO;
//    @Override
//    public List<User> getStudents() {
//        return studentServicesDAO.findAll();
//    }
//
//    @Override
//    public User getStudent(long studentID) {
//        return studentServicesDAO.findById(studentID).get();
//    }
//}
