package com.exam.exam.service.api;

import com.exam.exam.dto.StudentDTO;
import com.exam.exam.dto.TeacherDTO;
import com.exam.exam.module.Student;

import java.util.List;

public interface StudentsTeachersService {

    void addConnection(StudentDTO studentDTO, TeacherDTO teacherDTO);

    void deleteConnection(StudentDTO studentDTO, TeacherDTO teacherDTO);


}
