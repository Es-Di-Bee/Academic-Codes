public class Book {
    private String name = "";
    private Author a;
    private double price = 0.0;
    private int qty = 0;
    
    public Book(String n, double p, int q) {
        name = n;
        price = p;
        qty = q;
    }
    public String getName() {
        return name;
    } 
    public Author getAuthor() {
        return a;
    }
    public void setAuthor(Author athr) {
        a = athr;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int q) {
        qty = q;
    }
    public String toString() {
        return name + " by " + a.toString();
    }
}

    