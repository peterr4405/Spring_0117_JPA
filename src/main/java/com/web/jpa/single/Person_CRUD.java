package com.web.jpa.single;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Person_CRUD {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.web.jpa");
        appContext.refresh();

        PersonService service = (PersonService) appContext.getBean("personService");
        /*
        Person person = new Person();
        person.setName("Helen");
        service.save(person);
        */
        service.updateById("jason2", 2);
        
        
        service.printAll();

    }

}
