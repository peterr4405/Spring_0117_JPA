package com.web.jpa.single;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Test_add {
    
    public static void main(String[] args) {
        
        EntityManager em = Persistence.createEntityManagerFactory("p1").createEntityManager();
        Person person = new Person();
        person.setName("jason");
        
        try {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        em.close();
        System.out.println("add ok!");
        
    }
    
}
