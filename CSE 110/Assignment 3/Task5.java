import java.util.Scanner;
public class Task5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter desired seconds");
        int totalSeconds = sc.nextInt();
        int hours = totalSeconds / 3600;
        int seconds = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
    }
}