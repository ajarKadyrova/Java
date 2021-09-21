package POJO;

public class ShoppingCart {
    private int ID;
    private int bookID;
    private int bookCount;
    private int customerID;

    public ShoppingCart() {
    }

    public ShoppingCart(int ID, int bookID, int bookCount, int customerID) {
        this.ID = ID;
        this.bookID = bookID;
        this.bookCount = bookCount;
        this.customerID = customerID;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBookID() {
        return this.bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getBookCount() {
        return this.bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
