import java.util.Scanner;
public class Task24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = sc.nextInt();
        int count = 1;
        while(count<=number) 
        {
            System.out.print(count);
            count++;
        }
        for(count -= 2 ; count>=1; count--)
        {
            System.out.print(count);
        }
    }
}
            