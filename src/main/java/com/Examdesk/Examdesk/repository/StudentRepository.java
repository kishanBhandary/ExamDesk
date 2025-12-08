package com.Examdesk.Examdesk.repository;

import com.Examdesk.Examdesk.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {
}
