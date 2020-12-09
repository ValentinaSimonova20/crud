package com.exam.exam.controllers;

import com.exam.exam.dto.StudentDTO;
import com.exam.exam.dto.TeacherDTO;
import com.exam.exam.service.api.StudentsTeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students_teachers")
public class StudentTeacherController {

    @Autowired
    StudentsTeachersService studentsTeachersService;

    @GetMapping("/addConnection")
    public void addConnection(@RequestBody StudentDTO studentDTO, @RequestBody TeacherDTO teacherDTO){
        studentsTeachersService.addConnection(studentDTO, teacherDTO);
    }

    @GetMapping("/deleteConnection")
    public void deleteConnection(@RequestBody StudentDTO studentDTO, @RequestBody TeacherDTO teacherDTO){
        studentsTeachersService.deleteConnection(studentDTO, teacherDTO);
    }

}
