import java.io.IOException;

import java.util.Scanner;
public class Task1018 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int hundredCurrency = N / 100;
        int remaining = N % 100;
        int fiftyCurrency = remaining / 50;
        remaining %= 50;
        int twentyCurrency = remaining / 20;
        remaining %= 20;
        int tenCurrency = remaining / 10;
        remaining %= 10;
        int fiveCurrency = remaining / 5;
        remaining %= 5;
        int twoCurrency = remaining / 2;
        remaining %= 2;
        int oneCurrency = remaining / 1;
        remaining %= 1;
        System.out.printf("%d \n", N);
        System.out.printf("%d nota(s) de R$ 100,00 \n", hundredCurrency);
        System.out.printf("%d nota(s) de R$ 50,00 \n", fiftyCurrency);
        System.out.printf("%d nota(s) de R$ 20,00 \n", twentyCurrency);
        System.out.printf("%d nota(s) de R$ 10,00 \n", tenCurrency);
        System.out.printf("%d nota(s) de R$ 5,00 \n", fiveCurrency);
        System.out.printf("%d nota(s) de R$ 2,00 \n", twoCurrency);
        System.out.printf("%d nota(s) de R$ 1,00 \n", oneCurrency);
        
    }
    
}