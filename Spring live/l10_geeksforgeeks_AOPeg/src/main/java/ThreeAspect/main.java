package ThreeAspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {


        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring-config-aspects.xml");

        StudentThree s = (StudentThree) context.getBean("three");


       s.getName();
       s.getAddress();


    }




}
