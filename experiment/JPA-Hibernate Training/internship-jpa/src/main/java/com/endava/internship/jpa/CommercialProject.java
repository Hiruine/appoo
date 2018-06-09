package com.endava.internship.jpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("COMMERCIAL")
public class CommercialProject extends Project {

    private CommercialProject() { // for JPA
    }

    public CommercialProject(ProjectCode code, String name) {
        super(code, name);
    }
}
