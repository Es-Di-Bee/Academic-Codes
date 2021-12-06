import java.util.Scanner;
public class Task10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of your favourite car");
        String nameOfTheCar = sc.nextLine();
        for (int i = 1; i <= 4; ++i) {
            System.out.println(nameOfTheCar);
        }
    }
}
