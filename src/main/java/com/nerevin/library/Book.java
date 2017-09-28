package com.nerevin.library;

public class Book implements IArt {
    private String sheets, ArtName, AuthorName;
    private int Cost;
    public int getCost(){
        return this.Cost;
    }
    public void setCost(int Cost){
        this.Cost = Cost;
    }
    public String getSheets(){
        return this.sheets;
    }
    public void setSheets(String sheets){
        this.sheets = sheets;
    }
    public String getArtName(){
        return this.ArtName;
    }
    public void setArtName(String ArtName){
        this.ArtName = ArtName;
    }
    public String getAuthorName(){
        return this.AuthorName;
    }
    public void setAuthorName(String AuthorName){
        this.AuthorName = AuthorName;
    }
    Book(int Cost, String ArtName, String sheets, String AuthorName){
        this.Cost = Cost;
        this.ArtName = ArtName;
        this.sheets = sheets;
        this.AuthorName = AuthorName;
    }
    public String getType() {
        return "Book";
    }
    
    @Override
    public String toString() {
        return Cost + sheets + ArtName + AuthorName;
    }
}
