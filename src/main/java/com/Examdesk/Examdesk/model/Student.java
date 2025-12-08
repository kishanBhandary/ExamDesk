package com.Examdesk.Examdesk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("students")
public class Student {
    @Id
    private String usn;
    private String name;
    private String branch;
    private int sem;
    private String subjectcode;
}
