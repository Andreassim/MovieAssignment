package com.example.tineundervisning.models;

public class Movie {
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String awards;

    public Movie(){}

    public Movie(int year, int length, String title, String subject, int popularity, String awards) {
        setAwards(awards);
        setLength(length);
        setPopularity(popularity);
        setSubject(subject);
        setTitle(title);
        setYear(year);
    }

    public int getLength() {
        return length;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getYear() {
        return year;
    }

    public String getAwards() {
        return awards;
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    public String asTableData() {
        return "<tr><td>" +
                getYear() + "</td><td>" +
                getLength() + "</td><td>" +
                getTitle() + "</td><td>" +
                getSubject() + "</td><td>" +
                getPopularity() + "</td><td>" +
                getAwards() + "</td></tr>";
    }
}
