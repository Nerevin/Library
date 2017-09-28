package com.nerevin.library;

public class SchoolBook implements IArt{
    private String Sheets, ArtName, AuthorName;
    private int Cost;

    SchoolBook(int Cost, String ArtName, String Sheets, String AuthorName){
        this.Cost = Cost;
        this.ArtName = ArtName;
        this.Sheets = Sheets;
        this.AuthorName = AuthorName;
    }

    public int getCost() {
        return this.Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }

    public String getSheets() {
        return this.Sheets;
    }

    public void setSheets(String Sheets) {
        this.Sheets = Sheets;
    }

    public String getArtName() {
        return this.ArtName;
    }

    public void setArtName(String ArtName) {
        this.ArtName = ArtName;
    }
    public String getAuthorName(){
        return this.AuthorName;
    }
    public void setAuthorName(String AuthorName){
        this.AuthorName = AuthorName;
    }

    public String getType() {
        return "School Book";
    }
}
