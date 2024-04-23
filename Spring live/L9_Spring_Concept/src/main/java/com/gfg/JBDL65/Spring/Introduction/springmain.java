package com.gfg.JBDL65.Spring.Introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springmain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("Context "+context);

        Gretting g = (Gretting) context.getBean("Gretting");
        Gretting g1 = (Gretting) context.getBean("Gretting");

        //g.setMessage("Hello Pratik");

        g.display();

        Gretting greet2 = (Gretting) context.getBean("Gretting2");

        greet2.display();

        Gretting greet3 = (Gretting) context.getBean("Gretting3");
        Gretting greet4 = (Gretting) context.getBean("Gretting3");

        greet3.display();

        System.out.println(greet3);
        System.out.println(greet2);
        System.out.println(greet4);
        System.out.println(g);
        System.out.println(g1);


    }

}
