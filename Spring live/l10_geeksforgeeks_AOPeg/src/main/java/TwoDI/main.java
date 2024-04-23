package TwoDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-two.xml");

        StudentTwo s = (StudentTwo) context.getBean("namelist");

        System.out.println(s.getNameList());
        System.out.println(s.getCountrySet());
        System.out.println(s.getAddress());

    }

}
