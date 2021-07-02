import java.util.Random;
public class randomNumber {
    public static void main(String [] args) {
        Random dice = new Random(); // here 'dice' is just a variable name
        int number;
        for(int i=1; i<=5; i++) { // loop is for how many numbers will be generated 
            number = 1 + dice.nextInt(10); // the parameter 10 indicates that numbers will be generated upto 10
            // without the '+1' , random numbers would be generated from 0-9 , but with the '+1', it generates from 1-10
            System.out.println(number);
        }
    }
}
