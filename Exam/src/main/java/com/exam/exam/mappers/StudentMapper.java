package com.exam.exam.mappers;


import com.exam.exam.module.Student;
import com.exam.exam.module.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    @Select("Select * from student")
    List<Student> getAllStudents();

    @Select("select * from student where student_id=#{id}")
    Student getStudentById(Long id);

    @Insert("insert into student(first_name, last_name, middle_name, specialty, course) values( #{s.firstName}, #{s.lastName}, #{s.middleName}, #{s.specialty}, #{s.course})")
    void saveStudent(@Param("s") Student student);

    @Update("update student set first_name = #{s.firstName}, last_name = #{s.lastName}, middle_name = #{s.middleName}, specialty = #{s.specialty}, course = #{s.course}  " +
            " where student_id = #{s.studentId}")
    void updateStudent(@Param("s") Student student);

    @Delete("DELETE from student where student_id = #{s.studentId}")
    void deleteStudent(@Param("s") Student student);

}
