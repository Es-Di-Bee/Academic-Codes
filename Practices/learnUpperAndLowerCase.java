import java.util.Scanner;
public class learnUpperAndLowerCase { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iStr = sc.nextLine();
        String fStr = iStr.substring(0, 1).toUpperCase() + iStr.substring(1); /* capitalizes definite letter, 0,1 in the parameter
          means that 0-1 position letters will be capitalized */
        System.out.println(fStr);
        
        
        int upperCase = 0;
        int lowerCase = 0;
        for (int i = 0; i < fStr.length(); i++) { // fStr.length indicates the number of characters in the fStr string
            if (Character.isUpperCase(fStr.charAt(i))) { // this is to check the number of uppercases letter in the string
                upperCase ++;
            }
            if (Character.isLowerCase(fStr.charAt(i))) { // this is to check the number of lowercases letter in the string
                lowerCase ++;
            }
        }
        System.out.println("uppercase: " + upperCase);
        System.out.println("lowercase: " + lowerCase);
    }
}