package com.exam.exam.controllers;

import com.exam.exam.dto.StudentDTO;
import com.exam.exam.module.Student;
import com.exam.exam.service.api.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentsService studentsService;

    @GetMapping("/getAllStudents")
    public List<Student> getAll() {
        return studentsService.getAllStudents();
    }

    @GetMapping("/saveStudent")
    public void save(@RequestBody StudentDTO studentDTO){
        studentsService.saveStudent(studentDTO);
    }

    @GetMapping("/updateStudent")
    public void updateStudent(@RequestBody StudentDTO studentDTO){
        studentsService.updateStudent(studentDTO);
    }

    @GetMapping("/deleteStudent")
    public void deleteStudent(@RequestBody StudentDTO studentDTO){
        studentsService.deleteStudent(studentDTO);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentsService.getStudentById(id);
    }
}
