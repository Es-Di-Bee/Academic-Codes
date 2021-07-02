public class Book {
    private String title = "";
    private String author = "";
    private double price = 0.0;
    public Book() {
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public String toString() {
        String str = this.title + " written by " + this.author + " is " + this.price + "$";
        return str;
    }    
}