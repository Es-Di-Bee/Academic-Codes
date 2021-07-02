import java.util.Scanner;
public class pangramChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String istr = sc.nextLine();
        String fStr = istr.toLowerCase(); // turning all letters  into lowercase letters
        boolean[] arr = new boolean[26]; // initializes a boolean with 26 "false" flags
        for ( char c : fStr.toCharArray() ) { // the char c is going through all the characters of the fStr string like array system
            if ( c != ' ') {  // not counting the spaces 
                arr[c - 'a'] = true; /* here c indicates a letter of the string and "c-a" is just like the subtraction of integers, for 
                 example, if c is indicating "e" then c-a means 5-1=4. so everytime, a letter is making its array position value as true
                 . for example if "e" is found in the string, it will set the 5th index of the arr array as "true" */
            }
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == true) {
                count ++;
            }
        }
        if (count == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}