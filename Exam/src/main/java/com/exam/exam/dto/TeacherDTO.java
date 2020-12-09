package com.exam.exam.dto;

import lombok.Data;

@Data
public class TeacherDTO {
    private Integer teacherId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String department;
}
