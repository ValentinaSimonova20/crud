package com.exam.exam.mappers;

import com.exam.exam.module.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    @Select("Select * from teachers")
    List<Teacher> getAllTeachers();

    @Select("select * from teachers where teacher_id=#{id}")
    Teacher getTeacherById(Long id);

    @Insert("insert into teachers(first_name, last_name, middle_name, department) values( #{t.firstName}, #{t.lastName}, #{t.middleName}, #{t.department} )")
    void saveTeacher(@Param("t") Teacher teacher);

    @Update("update teachers set first_name = #{t.firstName}, last_name = #{t.lastName}, middle_name = #{t.middleName}, department = #{t.department} " +
            " where teacher_id = #{t.teacherId}   ")
    void updateTeacher(@Param("t") Teacher teacher);

    @Delete("DELETE from teachers where teacher_id = #{t.teacherId}")
    void deleteTeacher(@Param("t") Teacher teacher);


}
