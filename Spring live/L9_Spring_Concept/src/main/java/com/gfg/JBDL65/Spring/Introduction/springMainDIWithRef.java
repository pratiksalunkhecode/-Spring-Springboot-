package com.gfg.JBDL65.Spring.Introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springMainDIWithRef {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config2.xml");

        Employee e = (Employee) context.getBean("employeSetter");
        System.out.println(e);

        Employee e1 = (Employee) context.getBean("employeSetter");
        System.out.println(e);

        Employee e2 = (Employee) context.getBean("employeecons");
        System.out.println(e2);

        Employee e3 = (Employee) context.getBean("employeecons");
        System.out.println(e3);





    }

}
