public class Tester {
    public static void main(String[] args) {
        Author a1 = new Author("David", "Cameroon");
        Author a2 = new Author();
        a2.setFirstName("George");
        a2.setLastName("Martin");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
          