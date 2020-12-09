package com.exam.exam.service;

import com.exam.exam.dto.StudentDTO;
import com.exam.exam.dto.TeacherDTO;
import com.exam.exam.mappers.StudentTeacherMapper;
import com.exam.exam.module.Student;
import com.exam.exam.module.Teacher;
import com.exam.exam.service.api.StudentsTeachersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsTeachersImpl implements StudentsTeachersService {

    @Autowired
    StudentTeacherMapper studentTeacherMapper;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public void addConnection(StudentDTO studentDTO, TeacherDTO teacherDTO) {
        Student student = modelMapper.map(studentDTO, Student.class);

        Teacher teacher = modelMapper.map(teacherDTO, Teacher.class);

        studentTeacherMapper.addConnection(student, teacher);
    }

    @Override
    public void deleteConnection(StudentDTO studentDTO, TeacherDTO teacherDTO) {

        Student student = modelMapper.map(studentDTO, Student.class);

        Teacher teacher = modelMapper.map(teacherDTO, Teacher.class);

        studentTeacherMapper.deleteConnection(student, teacher);

    }
}
