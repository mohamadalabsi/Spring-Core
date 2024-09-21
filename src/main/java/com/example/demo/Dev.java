package com.example.demo;

import org.springframework.stereotype.Component;

@Component   // spring now know , this is the class it ha to manage
public class Dev {

    public  void build(){
        System.out.println("Hello World");
    }

}
