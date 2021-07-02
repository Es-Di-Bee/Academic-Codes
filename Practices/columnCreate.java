import java.util.Scanner;
public class columnCreate { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String divider = "-------------------------------------";
        System.out.println("Please enter 2 headers");
        String header1 = sc.nextLine(), header2 = sc.nextLine();
        System.out.println("Please enter 3 subjects");
        String subject1 = sc.nextLine(), subject2 = sc.nextLine(), subject3 = sc.nextLine();
        System.out.println("Please enter 3 objects");
        String object1 = sc.nextLine(), object2 = sc.nextLine(), object3 = sc.nextLine();
        System.out.printf("%-7s %26s %n", header1, header2);
        System.out.println(divider);
        System.out.printf("%-7s %23s %n", subject1, object1); 
        System.out.printf("%-7s %23s %n", subject2, object2);
        System.out.printf("%-7s %23s %n", subject3, object3);
        System.out.println(divider);
        // the -7 and plus 23 means that the distance between left justify and right justify is (23 + 7) = 30
    }
}
        