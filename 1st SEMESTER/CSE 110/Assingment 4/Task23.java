import java.util.Scanner;
public class Task23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int givenNumber = sc.nextInt();
        int number = givenNumber;
        int digit = 0;
        while(number/10!=0)
        {
            digit++;
            number = number/10;
        }
        int product = 1;
        int count = 1;
        while(count<=digit)
        {
            product = product*10;
            count++;
        }
        int num = givenNumber;
        while(num/product!=0)
        {
            digit = num/product;
            if(digit==0)
        {
            System.out.println("Zero");
        }
        if(digit==1)
        {
            System.out.println("One");
        }
        if(digit==2)
        {
            System.out.println("Two");
        }
        if(digit==3)
        {
            System.out.println("Three");
        }
        if(digit==4)
        {
            System.out.println("Four");
        }
        if(digit==5)
        {
            System.out.println("Five");
        }
        if(digit==6)
        {
            System.out.println("Six");
        }
        if(digit==7)
        {
            System.out.println("Seven");
        }
        if(digit==8)
        {
            System.out.println("Eight");
        }
        if(digit==9)
        {
            System.out.println("Nine");
        }
            num = num%product;
            if(num==0)
            {
            }
            else
            {
                product = product/10;
            }
        }
    }
}
        
        