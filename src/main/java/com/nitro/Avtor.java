package com.nitro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Avtor {


    @Id
  //  @Column(name = "avtors_id")
    @GeneratedValue
    private long id;

//    @ManyToMany
//    @JoinTable(name="avtors_books",
//            joinColumns = @JoinColumn(name="avtors_id", referencedColumnName="id"),
//            inverseJoinColumns = @JoinColumn(name="books_id", referencedColumnName="id"))
  //  private Set<Book> books=new HashSet<Book>();


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

//    public Set<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(Set<Book> books) {
//        this.books = books;
//    }

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

    public String toString(){
        return "avtor [ "+getName()+" "+getSecondName()+" ]";
    }


}
