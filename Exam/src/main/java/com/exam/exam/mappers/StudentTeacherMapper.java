package com.exam.exam.mappers;

import com.exam.exam.module.Student;
import com.exam.exam.module.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentTeacherMapper {

    @Insert("insert into student_teacher(teacher_id, student_id) values (#{studentId}, #{teacherId})")
    void addConnection(Student student, Teacher teacher);

    @Delete("DELETE  from student_teacher where student_id=#{studentId} and teacher_id=#{teacherId}")
    void deleteConnection(Student student, Teacher teacher);
}
