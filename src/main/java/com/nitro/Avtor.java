package com.nitro;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Avtor {


    @Id
  //  @Column(name = "avtors_id")
    @GeneratedValue
    private long id;

    @ManyToMany(mappedBy = "avtors",cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
//    @JoinTable(name="avtors_books",
//            joinColumns = @JoinColumn(name="avtors_id", referencedColumnName="id"),
//            inverseJoinColumns = @JoinColumn(name="books_id", referencedColumnName="id"))
    private Set<Book> books=new HashSet<Book>();


    private String name;
    private String secondName;

    public Avtor() {
    }

    public Avtor(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Book> getBooks() {
        return new HashSet<Book>(books);
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public void addBook(Book book) {
        if (books.contains(book))
            return;
        books.add(book);
    }

    public String toString(){
        return "avtor [ "+getName()+" "+getSecondName()+" ]";
    }


}
