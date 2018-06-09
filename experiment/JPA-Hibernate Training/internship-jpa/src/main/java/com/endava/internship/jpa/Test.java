package com.endava.internship.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.UUID;

public class Test {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");

        try {
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            Customer customer = new Customer(1L, "Google", new Address("Moldova", "Chisinau", "Stefan cel Mare 47", PhoneNumber.of("(+373 022 000 000)")));

            customer.addProject(new CommercialProject(ProjectCode.of("AA17"), "google drive"));

            entityManager.persist(customer);


            entityManager.flush();
            entityManager.clear();

            Customer fetchedCustomer = entityManager.find(Customer.class, 1L);

            fetchedCustomer.removeProject(ProjectCode.of("AA17"));

//            fetchedCustomer.addProject(new Project(ProjectCode.of("FF17"), "facebook"));

            entityManager.flush();

            System.out.println(fetchedCustomer);

            entityManager.getTransaction().commit();
        } finally {
            entityManagerFactory.close();
        }
    }
}
