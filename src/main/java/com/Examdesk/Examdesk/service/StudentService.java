package com.Examdesk.Examdesk.service;

import com.Examdesk.Examdesk.model.Student;
import com.Examdesk.Examdesk.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

}
