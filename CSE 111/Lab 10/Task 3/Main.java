public class Main {
    public static void main(String[] args) {
        Book b = new Book("Misir Ali", 900.25, 14);
        Author a1 = new Author("Humayan", "humayan.ahmed@gmail.com", 'm');
        b.setAuthor(a1);
        Book b1 = new Book("Himu", 800.50, 59);
        b1.setAuthor(a1);
        System.out.println(b);
        System.out.println(b1);
    }
}