package POJO;

public class Author {
    private int ID;
    private String authorName;
    private String authorAddress;
    private String url;

    public Author() {
    }

    public Author(int ID, String authorName, String authorAddress, String url) {
        this.ID = ID;
        this.authorName = authorName;
        this.authorAddress = authorAddress;
        this.url = url;
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAddress() {
        return this.authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
