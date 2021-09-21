package POJO;

public class Publisher {
    private int ID;
    private String publisherName;
    private String publisherAddress;
    private String publisherPhone;
    private String publisherURL;

    public Publisher() {
    }

    public Publisher(int ID, String publisherName, String publisherAddress, String publisherPhone, String publisherURL) {
        this.ID = ID;
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.publisherPhone = publisherPhone;
        this.publisherURL = publisherURL;
    }


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPublisherName() {
        return this.publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherAddress() {
        return this.publisherAddress;
    }

    public void setPublisherAddress(String publisherAddress) {
        this.publisherAddress = publisherAddress;
    }

    public String getPublisherPhone() {
        return this.publisherPhone;
    }

    public void setPublisherPhone(String publisherPhone) {
        this.publisherPhone = publisherPhone;
    }

    public String getPublisherURL() {
        return this.publisherURL;
    }

    public void setPublisherURL(String publisherURL) {
        this.publisherURL = publisherURL;
    }

}
