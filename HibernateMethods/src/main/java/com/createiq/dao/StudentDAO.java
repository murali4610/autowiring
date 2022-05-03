package com.createiq.dao;

import java.util.List;

import com.createiq.model.Student;

public interface StudentDAO {
 Integer save (Student student);
 
  void update(Student student);
  
  void delateByid(Integer sid);
  
  Student findById(Integer sid);
  
  List<Student>findAll();
  
}
