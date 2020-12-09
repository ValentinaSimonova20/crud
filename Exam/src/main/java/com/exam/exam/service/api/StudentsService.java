package com.exam.exam.service.api;

import com.exam.exam.dto.StudentDTO;
import com.exam.exam.module.Student;

import java.util.List;

public interface StudentsService {

    List<Student> getAllStudents();

    void saveStudent(StudentDTO studentDTO);

    void  updateStudent(StudentDTO studentDTO);

    void deleteStudent(StudentDTO studentDTO);

    Student getStudentById(Long id);
}
