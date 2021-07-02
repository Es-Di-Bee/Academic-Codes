import java.util.Scanner;
public class anagramChecking {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean[] bol = new boolean[b.length()];
        if (a.length() != b.length()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < a.length(); ++i) {
                for (int j = 0; j < b.length(); ++j) {
                    if (a.charAt(i) == b.charAt(j)) {
                        if (bol[j] == true) {
                            continue;
                        } else {
                            bol[j] = true;
                            break;
                        } 
                    }
                }
            }
            for (int i = 0; i < bol.length; ++i) {
                if (bol[i] == true) {
                    if (i == bol.length-1) {
                        System.out.println("Yes");
                    }
                } else {
                    System.out.println("No");
                    break;
                }
            }
        }
    }
}

            
                
            
    

