import java.io.IOException;

import java.util.Scanner;
public class Task1021 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double hundredCurrency = N / 100;
        hundredCurrency = Math.floor(hundredCurrency);
        double remaining = N % 100;
        double fiftyCurrency = remaining / 50;
        fiftyCurrency = Math.floor(fiftyCurrency);
        remaining %= 50;
        double twentyCurrency = remaining / 20;
        twentyCurrency = Math.floor(twentyCurrency);
        remaining %= 20;
        double tenCurrency = remaining / 10;
        tenCurrency = Math.floor(tenCurrency);
        remaining %= 10;
        double fiveCurrency = remaining / 5;
        fiveCurrency = Math.floor(fiveCurrency);
        remaining %= 5;
        double twoCurrency = remaining / 2;
        twoCurrency = Math.floor(twoCurrency);
        remaining %= 2;
        double oneCurrency = remaining / 1;
        oneCurrency = Math.floor(oneCurrency);
        remaining %= 1;
        remaining *= 100;
        double fiftyCoins = remaining / 50;
        fiftyCoins = Math.floor(fiftyCoins);
        remaining %= 50;
        double twentyFiveCoins = remaining / 25;
        twentyFiveCoins = Math.floor(twentyFiveCoins);
        remaining %= 25;
        double tenCoins = remaining / 10;
        tenCoins = Math.floor(tenCoins);
        remaining %= 10;
        double fiveCoins = remaining / 5;
        fiveCoins = Math.floor(fiveCoins);
        remaining %= 5;
        double oneCoins = remaining / 1;
        oneCoins = Math.floor(oneCoins);
        System.out.println("NOTAS:");
        System.out.printf("%.0f nota(s) de R$ 100.00", hundredCurrency);
        System.out.println();
        System.out.printf("%.0f nota(s) de R$ 50.00", fiftyCurrency);
        System.out.println();
        System.out.printf("%.0f nota(s) de R$ 20.00", twentyCurrency);
        System.out.println();
        System.out.printf("%.0f nota(s) de R$ 10.00", tenCurrency);
        System.out.println();
        System.out.printf("%.0f nota(s) de R$ 5.00", fiveCurrency);
        System.out.println();
        System.out.printf("%.0f nota(s) de R$ 2.00", twoCurrency);
        System.out.println();
        System.out.println("MOEDAS:");
        System.out.printf("%.0f moeda(s) de R$ 1.00", oneCurrency);
        System.out.println();
        System.out.printf("%.0f moeda(s) de R$ 0.50", fiftyCoins);
        System.out.println();
        System.out.printf("%.0f moeda(s) de R$ 0.25", twentyFiveCoins);
        System.out.println();
        System.out.printf("%.0f moeda(s) de R$ 0.10", tenCoins);
        System.out.println();
        System.out.printf("%.0f moeda(s) de R$ 0.05", fiveCoins);
        System.out.println();
        System.out.printf("%.0f moeda(s) de R$ 0.01", oneCoins);
        System.out.println();
    }
    
}