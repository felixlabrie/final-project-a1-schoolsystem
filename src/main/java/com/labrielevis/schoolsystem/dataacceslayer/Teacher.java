package com.labrielevis.schoolsystem.dataacceslayer;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Data
@ToString
public class Teacher {

    @Id
    private String teacherId;
    private String firstName;
    private String lastName;
    private String email;
}
