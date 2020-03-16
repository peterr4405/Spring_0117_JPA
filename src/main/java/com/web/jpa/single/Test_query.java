package com.web.jpa.single;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Test_query {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("p1").createEntityManager();
        List<Person> list = em.createNamedQuery("person.findAll", Person.class).getResultList();
        System.out.println(list);
        Person p = em.createNamedQuery("person.findByName", Person.class)
                .setParameter("name", "peter").getSingleResult();
        
        System.out.printf("+-%-10s-+-%<-10s-+\n", "----------");
        System.out.printf("| %-10s | %-10s |\n", "ID", "NAME");
        for (Person person : list) {
            System.out.printf("+-%-10s-+-%<-10s-+\n", "----------");
            System.out.printf("| %-10s | %-10s |\n", person.getId(), person.getName());
        }
        System.out.printf("+-%-10s-+-%<-10s-+\n", "----------");

        System.out.println(list);


        System.out.println(p);
        em.close();
    }

}
