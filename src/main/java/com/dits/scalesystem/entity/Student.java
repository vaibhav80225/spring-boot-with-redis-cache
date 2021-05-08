package com.dits.scalesystem.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created By vaibh on 3/7/2021
 */
//@RedisHash("Student")
@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String studentName;

    public Student(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
