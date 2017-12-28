package com.nerevin.library.entities;

public class SchoolBook implements IArt{
    private String sheets, artName, authorName;
    private int cost;

    public SchoolBook(int cost, String artName, String sheets, String authorName){
        this.cost = cost;
        this.artName = artName;
        this.sheets = sheets;
        this.authorName = authorName;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSheets() {
        return this.sheets;
    }

    public void setSheets(String sheets) {
        this.sheets = sheets;
    }

    public String getArtName() {
        return this.artName;
    }

    public void setArtName(String artName) {
        this.artName = artName;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public String getType() { return "Учебник"; }
}
