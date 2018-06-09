package com.endava.internship.jpa;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedNativeQueries;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "BOOK")
//@SQLDelete(sql = "update book set is_deleted = 1 where id = ?")
//@Where(clause = "is_deleted = 0")
public final class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NaturalId
    @Column(name = "ISBN")
    private String isbn;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "TITLE")
    private String title;

    @ElementCollection(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @CollectionTable(name = "BOOK_AUTHOR", joinColumns = @JoinColumn(name = "BOOK_ID"))
    private Set<Author> authors;

    @CreationTimestamp
    private Date createdAt;

    @Column(name = "IS_DELETED")
    private boolean deleted;

    private Book() {
    }

    public Book(String isbn, String title, Set<Author> authors) {
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {

        return Objects.hash(isbn);
    }

    public void changeTitle(String title) {
        this.title = title;
    }
}
