import java.util.Arrays;
import java.util.Scanner;
public class Task9 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int[] a = new int[10];
                int oddC = 0, evenC = 0;
                for (int i = 0; i < 10; ++i) {
                        a[i] = sc.nextInt();
                        if (a[i] % 2 == 0) {
                                evenC++;
                        } else {
                                oddC++;
                        }
                }
                int[] even = new int[evenC];
                int[] odd = new int[oddC];
                char ch = sc.next().charAt(0);
                if(ch == 'b') {
                        int index = 0;
                        for (int i = 0; i < 10; ++i) {
                                if (a[i] % 2 == 0) {
                                        even[index] = a[i];
                                        ++index;
                                }
                        }
                } else if (ch == 'a') {
                        int index = 0;
                        for (int i = 0; i < 10; ++i) {
                                if (a[i] % 2 != 0) {
                                        odd[index] = a[i];
                                        ++index;
                                } 
                        }
                }
                Arrays.sort(a);
                Arrays.sort(even);
                Arrays.sort(odd);
                if (ch == 'a') {
                        int index = 0;
                        for (int i  = 0; i < 10; ++i) {
                                if (a[i] %2 == 0) {
                                        System.out.println(a[i]);
                                } else {
                                        System.out.println(odd[index]);
                                        ++index;
                                }
                        }
                }
                else if (ch == 'b') {
                        int index = 0;
                        for (int i  = 0; i < 10; ++i) {
                                if (a[i] %2 != 0) {
                                        System.out.println(a[i]);
                                } else {
                                        System.out.println(even[index]);
                                        ++index;
                                }
                        }
                } else {
                        for (int i  = 0; i < 10; ++i) {
                                System.out.println(a[i]);
                        }
                }
        }
}