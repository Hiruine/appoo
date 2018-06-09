package com.endava.internship.jpa;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");

        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();


            entityManager.getTransaction().begin();

            entityManager.persist(new Book("1234", "Hibernate", Set.of(new Author("Gavin", "King"), new Author("Christian", "Bauer"))));

            entityManager.getTransaction().commit();

            entityManager.clear();

            entityManager.getTransaction().begin();

            Book book = entityManager.find(Book.class, 1L, LockModeType.PESSIMISTIC_WRITE);

            book.changeTitle("JPA/Hibernate");

            entityManager.getTransaction().commit();


            System.out.println(book);
        } finally {
            entityManagerFactory.close();
        }
    }
}
