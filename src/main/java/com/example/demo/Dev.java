package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component   // spring now know , this is the class it has to manage
public class Dev {
//? and remember all variables and attribute should be private (we did that while learning Hibernate , JPA and now Spring ) , the Variables that we used in classes to create tables in the databases eventually

//! 1    it will cause an error
//       Laptop laptop;//now this is aa reference but not the object (new Laptop()) , and in default it is NULL
//! 2   it will work but this is not what we want
//      Laptop laptop = new Laptop();

//! 3   now the right way
//?           field injection
//        @Autowired // this mean to spring that i want to create an  object of dev but dev dependent on laptop so i will connect them  together
//        and how it knows u want to connect with laptop only = it goes for by type Laptop
//        private   Laptop laptop;


////?        constructor injection
////    public Dev(Laptop laptop) {
////        this.laptop = laptop;
////    }
////?        setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//
//    }


    @Autowired
    @Qualifier("laptop") // the name of the instance and not the name of the class 
    private  Computer comp;

//  now we have 2 classes implementing the computer interface and both with component annotation , so it will give an error ,
//  and in this case we use another annotation Primary 1
//  or comment one of them   2
//  and if u do not use primary , use Qualifier
    public  void build(){
        comp.compile();

        System.out.println("Hello World");
    }

}
