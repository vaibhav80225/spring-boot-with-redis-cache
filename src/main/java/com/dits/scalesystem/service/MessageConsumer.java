//package com.dits.scalesystem.service;
//
//import com.dits.scalesystem.entity.Student;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.jms.annotation.EnableJms;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
///**
// * Created By vaibh on 3/12/2021
// */
//
//@EnableJms
//@Component
//public class MessageConsumer {
//
//    private final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
//
//    @JmsListener(destination = "test-queue")
//    public void listener(Student student){
//        logger.info("Message received {} ", student.getStudentName());
//    }
//}
