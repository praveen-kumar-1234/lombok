package com.praveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LombokExampleApplication.class, args);
        Student student=new Student();
        student.setId(1l);
        System.out.println(student.getId());
        student.setName("My name is Praveen");
        System.out.println(student.getName());
        student.setPhone("234567");
        System.out.println(student.getPhone());
        System.out.println(student);
    }

}
