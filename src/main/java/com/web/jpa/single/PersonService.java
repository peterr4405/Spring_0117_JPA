package com.web.jpa.single;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonService {
    
    @Autowired
    private PersonRepository repository;
    
    public void printAll(){
        repository.findAll().forEach(System.out::println);
    }
    
    public void save(Person person){
        repository.save(person);
        System.out.println("save ok!");
    }
    
    public void updateById(String name,Integer id){
        Person person = repository.findById(id).get();
        person.setName(name);
        repository.save(person);
        System.out.println("update ok!");
        
    }
    
}
