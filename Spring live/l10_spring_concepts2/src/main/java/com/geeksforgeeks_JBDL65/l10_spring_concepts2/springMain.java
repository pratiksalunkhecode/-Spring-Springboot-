package com.geeksforgeeks_JBDL65.l10_spring_concepts2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-DICollections.xml");

        DICollections bean = (DICollections) context.getBean("collDI");

        System.out.println(bean.getNameList());
        System.out.println(bean.getCountrySet());
        System.out.println(bean.getAddressMap());



    }

}
