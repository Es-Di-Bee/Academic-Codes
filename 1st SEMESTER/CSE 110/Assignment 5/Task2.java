public class Task2
{
    public static void main(String[] args)
    {
        int[] marks = {10, 30, 20, 50, 40};
        int count = 0;
        int sum = 0;
        while(count<=4)
        {
            sum+= marks[count];
            count++;
        }
        double avg = sum/5.0;
        count = 0;
        int betterCount = 0;
        System.out.println("Mark of students better than average are: ");
        while(count<5)
        {
            if(marks[count]>avg)
            {
                betterCount++;
                System.out.println(marks[count]);
            }
            count++;
        }
        System.out.println("and " + betterCount + " students are better than average");
    }
}

