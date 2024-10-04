package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component   // spring now know , this is the class it has to manage
public class Dev {
//? and remember all variables and attribute should be private (we did that while learning Hibernate , JPA and now Spring ) , the Variables that we used in classes to create tables in the databases eventually

//! 1    it will cause an error
//       Laptop laptop;//now this is aa reference but not the object (new Laptop()) , and in default it is NULL
//! 2   it will work but this is not what we want
//      Laptop laptop = new Laptop();

//! 3   now the right way
    // field injection
        @Autowired// this mean to spring that i want to create an  object of dev but dev dependent on laptop so i will connect them  together
        private   Laptop laptop;
    public  void build(){
        laptop.compile();

        System.out.println("Hello World");
    }

}
