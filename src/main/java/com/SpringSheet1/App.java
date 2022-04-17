package com.SpringSheet1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee emp1=(Employee)context.getBean("emp1");
        Employee emp2=(Employee)context.getBean("emp2");
        Employee emp3=(Employee)context.getBean("emp3");
        Employee emp4=(Employee)context.getBean("emp4");

        System.out.println("**SETTER INJECTION WITH VALUE AS ATTRIBUTE**");
        System.out.println(emp1);
        System.out.println("**SETTER INJECTION WITH P SCHEMA**");
        System.out.println(emp2);
        System.out.println("**CONSTRUCTOR INJECTION WITH VALUE AS ATTRIBUTE**");
        System.out.println(emp3);
        System.out.println("**CONSTRUCTOR INJECTION WITH P SCHEMA**");
        System.out.println(emp4);

    }
}
