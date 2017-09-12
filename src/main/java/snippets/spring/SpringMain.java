package snippets.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

    public static void main (String[] args) {
        //create ApplicationContext
        @SuppressWarnings("resource")
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        //call and print applicationContext.getBean first time
        System.out.println("Course Service 1 - " + applicationContext.getBean("courseService"));
        System.out.println("Course Service 2 - " + applicationContext.getBean("courseService"));
    }

}
