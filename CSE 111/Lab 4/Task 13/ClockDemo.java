import java.util.Scanner;
public class ClockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = sc.nextInt();
        Clock firstClock = new Clock(sec);
        
        for (int i = 1; i <= 10; ++i) {
            firstClock.tick();
            System.out.println(firstClock.toString());
        }
        
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        Clock secondClock = new Clock(h,m,s);
        
        for (int i = 1; i <= 10; ++i) {
            secondClock.tick();
            System.out.println(secondClock.toString());
        }
        
        firstClock.addClock(secondClock);
        System.out.println(firstClock.toString());
        System.out.println(secondClock.toString());
        
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println(thirdClock.toString());
        
        sc.close();
    }
}