package com.course.spring.introduction;

import lombok.Data;


@Data
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("meow");
    }
}
