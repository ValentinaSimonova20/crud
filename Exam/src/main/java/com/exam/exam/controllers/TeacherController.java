package com.exam.exam.controllers;

import com.exam.exam.dto.TeacherDTO;
import com.exam.exam.module.Teacher;
import com.exam.exam.service.TeacherServiceImpl;
import com.exam.exam.service.api.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeachersService teacherService;

    @GetMapping("/getAllTeachers")
    public List<Teacher> getAll(){
        return teacherService.getAllTeachers();
    }

    @GetMapping("/saveTeacher")
    public void save(@RequestBody TeacherDTO teacherDTO){
        teacherService.saveTeacher(teacherDTO);
    }

    @GetMapping("/updateTeacher")
    public void updateTeacher(@RequestBody TeacherDTO teacherDTO){
        teacherService.updateTeacher(teacherDTO);
    }

    @GetMapping("/deleteTeacher")
    public void deleteTeacher(@RequestBody TeacherDTO teacherDTO){
        teacherService.deleteTeacher(teacherDTO);
    }

    @GetMapping("/getTeacher/{id}")
    public Teacher getTeacherById(@PathVariable("id") Long id){
        return teacherService.getTeacherById(id);
    }


}
