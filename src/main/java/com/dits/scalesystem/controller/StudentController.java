package com.dits.scalesystem.controller;

import com.dits.scalesystem.entity.Student;
import com.dits.scalesystem.repo.StudentRepository;
import com.dits.scalesystem.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created By vaibh on 3/7/2021
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

//    @Autowired
//    private Queue queue;

//    @Autowired
//    private JmsTemplate jmsTemplate;

//    @PostMapping("/")
//    public String saveStudent(@RequestBody Student student){
//        try{
//            jmsTemplate.convertAndSend(queue, new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(student));
//            studentService.saveStudent(student);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        return "Saved |";
//    }
//
//    @GetMapping("/{id}")
//    public Student getStudent(@PathVariable("id") Integer id){
//        return studentService.getStudentById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteStudentById(@PathVariable("id") Integer id){
//        studentService.deleteStudentById(id);
//        return "Delete !";
//    }

    @GetMapping("/testing")
    public String teting() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "ok");
        map.put("2", "ppp");
        map.put("3", "www");
        map.put("1", "pl");
        System.out.println(map);
        int array [] = new int[5];
        System.out.println(array[0]);
        try{
            int a = 4/0;

        }catch (Exception ee){
            System.out.println("Exception");
        }
        finally {
            System.out.println("finally");
        }
        return "ok";
    }
}
