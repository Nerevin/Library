package com.nerevin.library.entities;

public class Author implements IAuthor {
    private String name, surname, authorBook;
    private int age;

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return this.surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getAuthorBook(){
        return this.authorBook;
    }
    public void setAuthorBook(String AuthorBook){
        this.authorBook = AuthorBook;
    }
    public Author(int age, String name, String surname, String authorBook){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.authorBook = authorBook;
    }
}
