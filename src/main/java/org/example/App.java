package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // configure your container 'context' with xml file 'spring.xml'
        // bcz Developer bean is not already existing in container 'context'
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        .IllegalStateException: BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
        Developer obj = context.getBean(Developer.class);
//        obj.setAge(18);
//        System.out.println(obj.getAge());
        obj.build(); //NullPointerException: Cannot invoke "org.example.Laptop.compile()" because "this.laptop" is null
    }
}
