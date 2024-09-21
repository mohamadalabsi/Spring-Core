package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
////!         Dependencies injection using spring boot


        ApplicationContext context= SpringApplication.run(DemoApplication.class, args); //! this is responsible for creating the container in JVM
        Dev dev =  context.getBean(Dev.class);
        dev.build();

//      the idea of spring is that spring creat the object for us , but we have to specify which objects we need to be in the container
//         so this works but not we want
//        var dev = new Dev();  // this here will create the object outside the container
//        dev.build();



    }

}
