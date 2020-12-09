package com.exam.exam.service;

import com.exam.exam.dto.TeacherDTO;
import com.exam.exam.mappers.TeacherMapper;
import com.exam.exam.module.Teacher;
import com.exam.exam.service.api.TeachersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeachersService {

    @Autowired
    TeacherMapper teacherMapper;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherMapper.getAllTeachers();
    }

    @Override
    public void saveTeacher(TeacherDTO teacherDTO) {

        Teacher teacher = modelMapper.map(teacherDTO, Teacher.class);

        teacherMapper.saveTeacher(teacher);
    }

    @Override
    public void updateTeacher(TeacherDTO teacherDTO) {

        Teacher teacher = modelMapper.map(teacherDTO, Teacher.class);
        teacherMapper.updateTeacher(teacher);


    }

    @Override
    public void deleteTeacher(TeacherDTO teacherDTO) {

        Teacher teacher = modelMapper.map(teacherDTO, Teacher.class);
        teacherMapper.deleteTeacher(teacher);
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherMapper.getTeacherById(id);
    }
}
