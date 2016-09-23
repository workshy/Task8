package ua.epam.Class;

import java.util.Arrays;

/**
 * Created by Viktoriia_Marynchak on 9/22/2016.
 */
public class Book {
    protected String name;
    protected int yearPublished;
    protected int circulation;
    protected int quantityPages;
    protected String[] author;

    public Book() {
    }

    public Book(String name, int yearPublished, int circulation, int quantityPages, String...author) {
        this.name = name;
        this.yearPublished = yearPublished;
        this.circulation = circulation;
        this.quantityPages = quantityPages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getCirculation() {
        return circulation;
    }

    public void setCirculation(int circulation) {
        this.circulation = circulation;
    }

    public int getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(int quantityPages) {
        this.quantityPages = quantityPages;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Name of Book " + name + '\n' +
                "Year of publishing " + yearPublished + '\n' +
                "Circulation " + circulation + '\n' +
                "Quantity of pages " + quantityPages + '\n' +
                "Author(s) " + Arrays.toString(author);
    }

    public void print(){
        System.out.println("FSWFRFWSRWEW");
    }
}
