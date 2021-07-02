import java.util.Scanner;
public class AlifsAssignment{
        public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                
                int spcCnt2 = -1;
                for (int i = 1, spcCnt1 = n-1;      i <= n;     ++i, --spcCnt1, spcCnt2+=2) {
                       for (int j = 1; j <= spcCnt1; ++j) {
                                System.out.print(" ");
                        }
                        
                       if (i == 1) {
                               System.out.println("1");
                       } else if (i == n) {
                               
                               for (int j = 1; j <= spcCnt2+2; ++j) {
                                       System.out.print("1");
                               }
                               System.out.println();
                       } else {
                               System.out.print("1");
                               for (int j = 1; j <= spcCnt2; ++j) {
                                       System.out.print(" ");
                               }
                               System.out.println("1");
                       }
                }
                
                for (int i = 1; i <= n; ++i) {
                        System.out.print(" 1");
                        for (int j = 1; j <= spcCnt2-4; ++j) {
                                if (i != n) {
                                        System.out.print(" ");
                                } else {
                                        System.out.print("1");
                                }
                        }
                        System.out.println("1");
                }
        }
}