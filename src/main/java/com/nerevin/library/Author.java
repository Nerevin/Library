package com.nerevin.library;

public class Author implements IAuthor {
    private String Name, Surname, AuthorBook;
    private int Age;

    public int getAge(){
        return this.Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public String getName(){
        return this.Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getSurname(){
        return this.Surname;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    public String getAuthorBook(){
        return this.AuthorBook;
    }
    public void setAuthorBook(String AuthorBook){
        this.AuthorBook = AuthorBook;
    }
    Author(int Age, String Name, String Surname, String AuthorBook){
        this.Age = Age;
        this.Name = Name;
        this.Surname = Surname;
        this.AuthorBook = AuthorBook;
    }
}
