package com.exam.exam.service.api;

import com.exam.exam.dto.StudentDTO;
import com.exam.exam.dto.TeacherDTO;
import com.exam.exam.module.Student;
import com.exam.exam.module.Teacher;

import java.util.List;

public interface TeachersService {

    List<Teacher> getAllTeachers();

    void saveTeacher(TeacherDTO teacherDTO);

    void  updateTeacher(TeacherDTO teacherDTO);

    void deleteTeacher(TeacherDTO teacherDTO);

    Teacher getTeacherById(Long id);
}
