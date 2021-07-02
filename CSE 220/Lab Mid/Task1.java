import java.util.Scanner;
public class Task1 {
    public static int size = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        sc.nextLine();
        Grocery[] a = new Grocery[items];
        for (int i = 0; i < a.length; ++i) {
            a[i] = new Grocery();
            a[i].name = sc.nextLine();
            a[i].quantity = sc.nextInt();
            sc.nextLine();
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = i+1; j < a.length; ++j) {
                if (a[i].quantity > a[j].quantity) {
                    Grocery temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        size = a.length;
        a = insertion(a, size);
        for (int i = 0; i < size; ++i) {
            System.out.println(a[i].name + " " + a[i].quantity);
        }
    }
    public static Grocery[] insertion(Grocery[] a, int size) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please enter the name, quantity and position where you want to insert");
        String n = sc2.nextLine();
        int q = sc2.nextInt();
        int idx = sc2.nextInt();
        if (size == a.length) {
            a = resize(a, a.length + 2);
        }
        int i = size;
        for (; i > idx; --i) {
            a[i] = a[i-1];
        }
        a[i] = new Grocery();
        a[i].name = n;
        a[i].quantity = q;
        ++size;
        sc2.nextLine();
        return a;
    }
    public static Grocery[] resize(Grocery[] a, int length) {
        Grocery[] b = new Grocery[length];
        for (int i = 0; i < a.length; ++i) {
            b[i] = a[i];
        }
        return b;
    }
}

class Grocery {
    String name = "";
    int quantity = 0;
}