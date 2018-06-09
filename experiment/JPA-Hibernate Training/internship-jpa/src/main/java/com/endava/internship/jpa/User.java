package com.endava.internship.jpa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "USER")
public class User {

    @EmbeddedId
    private UserId userId;

    private User() { // for JPA
    }

    public User(UserId userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return userId.username;
    }

    public static class UserId implements Serializable {

        private static final long serialVersionUID = -3356114058477407999L;

        private Long tenantId;

        private String username;

        private UserId() { // for JPA
        }

        public UserId(Long tenantId, String username) {
            this.tenantId = tenantId;
            this.username = username;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UserId userId = (UserId) o;
            return Objects.equals(tenantId, userId.tenantId) &&
                    Objects.equals(username, userId.username);
        }

        @Override
        public int hashCode() {

            return Objects.hash(tenantId, username);
        }
    }
}
