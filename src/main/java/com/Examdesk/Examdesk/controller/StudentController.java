package com.Examdesk.Examdesk.controller;

import com.Examdesk.Examdesk.model.Student;
import com.Examdesk.Examdesk.repository.StudentRepository;
import com.Examdesk.Examdesk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/students")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("/testss")
    public void addStudent(Student student) {
        studentService.addStudent(student);

    }
}
