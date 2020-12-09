package com.exam.exam.service;

import com.exam.exam.dto.StudentDTO;
import com.exam.exam.mappers.StudentMapper;
import com.exam.exam.module.Student;
import com.exam.exam.service.api.StudentsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentsService {

    @Autowired
    private StudentMapper studentMapper;


    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }

    @Override
    public void saveStudent(StudentDTO studentDTO) {

        Student student = modelMapper.map(studentDTO, Student.class);

        studentMapper.saveStudent(student);

    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {

        Student student = modelMapper.map(studentDTO, Student.class);

        studentMapper.updateStudent(student);
    }

    @Override
    public void deleteStudent(StudentDTO studentDTO) {

        Student student = modelMapper.map(studentDTO, Student.class);

        studentMapper.deleteStudent(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentMapper.getStudentById(id);
    }
}
