public class Task1
{
    public static void main(String[] args)
    {
        int[] marks = {10, 30, 20, 50, 40};
        int max = marks[0];
        int min = marks[0];
        int sum = 0;
        int count = 0;
        while(count<=4)
        {
            if(marks[count]<min)
            {
                min = marks[count];
            }
            else if(marks[count]>max)
            {
                max = marks[count];
            }
            sum+= marks[count];
            count++;
        }
        double avg = sum/5.0;
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }
}

