import java.util.Scanner;
public class bupIUPCproblem3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int tc = 1; tc <= t; ++tc) {
            String str = sc.nextLine();
            String strDigits = str.replaceAll("\\D+", ""); // extracted the digits from the String and put them in a new String
            int digits = Integer.parseInt(strDigits); // converted the new String into an integer
            int[] a = new int[strDigits.length()]; // created an array with index number same as extracted digit number 
            for (int i = a.length-1; i >= 0; --i) { 
                a[i] = digits % 10;  // put the digits in the array in reversed sequence
                digits /= 10;
            }
            String letters = str.replaceAll("\\d", " "); // replaced all the digits with space of the main input 
            String[] b = letters.split(" "); // put the individual syllables in an array
            String decompressedStr = ""; // created a new String to keep the decompressed form of the given String
            for (int i = 0; i < b.length; ++i) {
                for (int j = a[i]; j > 0; j--) {
                    decompressedStr += b[i];
                }
            }
            int q = sc.nextInt();
            System.out.println("Case " + tc + ":");
            for (int queries = 1; queries <= q; ++queries) {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
                if (l < 0 || r < 0 || l > decompressedStr.length() || r > decompressedStr.length() ) {
                    System.out.print("-1");
                } else {
                    while (l <= r) {
                        System.out.print(decompressedStr.charAt(l));
                        l++;
                    }
                }
                System.out.println();
            }
            sc.nextLine();
        }
    }
}
