package com.nitro;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER)
    private Set<Avtor> avtors = new HashSet<Avtor>();

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Avtor> getAvtors() {
        return avtors;
    }

    public void setAvtors(Set<Avtor> avtors) {
        this.avtors = avtors;
    }

    public String toString(){
        return "book: "+getName();
    }
//    public void addAvtor(Avtor avtor){
//        if (avtors.contains(avtor))
//            return;
//        avtors.add(avtor);
//    }

//    public void addAvtor(Avtor avtor) {
//        avtors.add(avtor);
//    }
}
