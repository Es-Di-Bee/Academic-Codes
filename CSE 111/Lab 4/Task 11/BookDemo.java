public class BookDemo {
    public static void main(String[] args) {
        Book Author = new Book("Developing Java Software", "Russel Winderand", 79.75);
        Book b1 = new Book();
        b1.setTitle("Java the complete reference");
        b1.setAuthor("Hervert Schield");
        b1.setPrice(255.12);
        System.out.println(Author.toString());
        System.out.println(b1.toString());
    }
}