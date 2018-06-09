package com.endava.internship.jpa;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @Column(name = "ID")
    private Long id;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "NAME")
    private String name;

//    @Convert(converter = PhoneNumberAttributeConverter.class, attributeName = "phoneNumber")
    private Address address;

    @OneToMany(cascade = CascadeType.PERSIST/*, fetch = FetchType.EAGER, orphanRemoval = true*/)
    @JoinColumn(name = "CUSTOMER_ID")
    private Set<Project> projects;

    private Customer() { // for JPA
    }

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
        projects = new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addProject(Project project) {
        Objects.requireNonNull(project, "The project must not be null.");
        if (projects.size() >= 10) {
            throw new IllegalArgumentException("Max allowed projects is 10");
        }
        projects.add(project);
    }

    public void removeProject(ProjectCode projectCode) {
        projects.removeIf(project -> project.code().equals(projectCode));
    }

    public void changeName(String name) {
        //guard
        this.name = name;
    }
}
