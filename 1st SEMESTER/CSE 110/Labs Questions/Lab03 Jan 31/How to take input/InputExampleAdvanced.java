import java.util.Scanner;

public class InputExampleAdvanced
{  
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner ( System.in );
        
        System.out.println("Please Enter an int");
        int x; 
        x = keyboard.nextInt();
        System.out.println("Apnar int: " + x);
        System.out.println();
        
        System.out.println("Please Enter a float");
        float y;
        y = keyboard.nextFloat();
        System.out.println("Apnar float: "+y);
        System.out.println();
        
        System.out.println("Please Enter a double");
        double d;
        d = keyboard.nextDouble();
        System.out.println("Apnar double: "+d);
        System.out.println();
        
        System.out.println("Please Enter a line");
        String agerEnter;
        // this extra command is needed to remove 
        // the enter pressed after last double input
        agerEnter = keyboard.nextLine(); 
        
        String line;
        // this line actually takes the line as input 
        line = keyboard.nextLine(); 
        System.out.println("Apnar line: "+line);
        System.out.println();
        
        System.out.println("Please Enter a word");
        String word;
        word= keyboard.next(); 
        System.out.println("Apnar word: "+word);
        System.out.println();
        
        System.out.println("Please Enter a character");
        String odorkariEnter;
        // this extra command is needed to remove 
        // the enter pressed after last double input
        odorkariEnter = keyboard.nextLine(); 
        
        String shobkisu;
        shobkisu= keyboard.nextLine(); 
        char okkhor;
        okkhor = shobkisu.charAt(0);
        System.out.println("Apnar character: "+okkhor);
    }
}

