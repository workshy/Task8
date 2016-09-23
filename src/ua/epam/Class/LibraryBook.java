package ua.epam.Class;

import ua.epam.Annotation.Author;
import ua.epam.Interface.IAuthor;

/**
 * Created by Viktoriia_Marynchak on 9/22/2016.
 */
public class LibraryBook extends Book implements IAuthor {
    private int inventoryNumber;

    @Author
    private String reader;

    public LibraryBook() {
    }

    public LibraryBook(String name, int yearPublished, int circulation,
                       int quantityPages, int inventoryNumber, String reader, String... author) {
        super(name, yearPublished, circulation, quantityPages, author);
        this.inventoryNumber = inventoryNumber;
        this.reader = reader;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Inventory number " + inventoryNumber + '\n' +
                "Reader name " + reader + '\n';
    }

    @Override
    public void print() {
        System.out.println("This method is marked with the override annotation");
    }
}
