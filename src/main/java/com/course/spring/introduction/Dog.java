package com.course.spring.introduction;

import lombok.Data;

@Data
public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog bean is created");
    }

    public void say(){
        System.out.println("woof");

    }
}
