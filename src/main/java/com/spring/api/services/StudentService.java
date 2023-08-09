package com.spring.api.services;

import com.spring.api.user.User;

import java.util.List;

public interface StudentService {
    public List<User> getStudents();
    public User getStudent(long studentID);
}
