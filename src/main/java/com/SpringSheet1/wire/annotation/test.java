package com.SpringSheet1.wire.annotation;
import com.SpringSheet1.wire.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("autoconfig.xml");
        com.SpringSheet1.wire.Student std1=context.getBean("std1", com.SpringSheet1.wire.Student.class);
        System.out.println("Using Annotation");
        System.out.println(std1);




    }

}


