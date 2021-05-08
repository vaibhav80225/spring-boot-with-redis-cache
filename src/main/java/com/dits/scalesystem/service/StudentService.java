package com.dits.scalesystem.service;

import com.dits.scalesystem.entity.Student;
import com.dits.scalesystem.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created By vaibh on 3/8/2021
 */

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @CachePut(value = "student", key = "#student.id")
    public
    saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Cacheable(value = "student" , key = "#id")
    public Student getStudentById(Integer id){
        return studentRepository.findById(id).get();
    }

    @CacheEvict(value = "student")
    public void deleteStudentById(Integer id){
        studentRepository.deleteById(id);
    }
}
