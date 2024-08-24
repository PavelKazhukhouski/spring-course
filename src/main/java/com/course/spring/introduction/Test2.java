package com.course.spring.introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet dog = applicationContext.getBean("myPet", Pet.class);
        dog.say();


        applicationContext.close();
    }
}
