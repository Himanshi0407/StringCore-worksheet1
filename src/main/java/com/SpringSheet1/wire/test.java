package com.SpringSheet1.wire;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
        Student std1=context.getBean("std1",Student.class);
        Student std2=context.getBean("std2",Student.class);
        System.out.println("By Name autowire functionality.");
        System.out.println(std1);
        System.out.println("By type autowire functionality.");
        System.out.println(std2);


    }

}

