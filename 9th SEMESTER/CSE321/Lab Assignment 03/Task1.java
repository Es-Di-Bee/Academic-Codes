import java.util.Scanner;

public class Task1 extends Thread {
    Scanner sc = new Scanner(System.in);

    Task1(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (getName().equals("add")) {
            addition();
        }
        if (getName().equals("sub")) {
            subtraction();
        }
        if (getName().equals("mul")) {
            multiplication();
        }
        if (getName().equals("div")) {
            division();
        }
        if (getName().equals("oth")) {
            others();
        }
    }

    public void addition() {
        System.out.println("Please enter 2 numbers");
        int x = sc.nextInt(); int y = sc.nextInt();
        System.out.println("Addition Result: " + (x + y));
    }

    public void subtraction() {
        System.out.println("Please enter 2 numbers");
        int x = sc.nextInt(); int y = sc.nextInt();
        System.out.println("Subtraction Result: " + (x - y));
    }

    public void multiplication() {
        System.out.println("Please enter 2 numbers");
        int x = sc.nextInt(); int y = sc.nextInt();
        System.out.println("Multiplication Result: " + (x * y));
    }

    public void division() {
        System.out.println("Please enter 2 numbers");
        int x = sc.nextInt(); int y = sc.nextInt();
        System.out.println("Division Result: " + ((double)x / y));
    }

    public void others() {
        System.out.println("No valid operation");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Task1 thread1 = new Task1("add");
        Task1 thread2 = new Task1("sub");
        Task1 thread3 = new Task1("mul");
        Task1 thread4 = new Task1("div");
        Task1 thread5 = new Task1("oth");

        System.out.println("Press 1 for add thread\nPress 2 for sub thread\nPress 3 for mul thread\nPress 4 for div thread\nPress 5 for other threads");
        int cmd  = sc.nextInt();
        if (cmd == 1) thread1.start();
        if (cmd == 2) thread2.start();
        if (cmd == 3) thread3.start();
        if (cmd == 4) thread4.start();
        if (cmd == 5) thread5.start();
    }

}
