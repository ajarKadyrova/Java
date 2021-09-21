package POJO;

public class Book {
    private int id;
    private int year;
    private int publisherID;
    private int authorID;
    private String title;
    private double price;

    public Book() {
    }

    public Book(int id, int year, int publisherID, int authorID, String title, double price) {
        this.id = id;
        this.year = year;
        this.publisherID = publisherID;
        this.authorID = authorID;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPublisherID() {
        return this.publisherID;
    }

    public void setPublisherID(int publisherID) {
        this.publisherID = publisherID;
    }

    public int getAuthorID() {
        return this.authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
