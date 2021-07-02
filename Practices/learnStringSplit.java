import java.util.Scanner;
public class learnStringSplit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] parts = str.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        
        System.out.println(part1);
        System.out.println(part2);
        
        
    }
}