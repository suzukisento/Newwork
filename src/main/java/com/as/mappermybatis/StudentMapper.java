package com.as.mappermybatis;

import com.as.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {
    Student selectById(Integer stuId);
    List<Student> selectAll();
    void insertOne(Student student);
    void updateOne(Student student);
    void deleteById(Integer id);
}