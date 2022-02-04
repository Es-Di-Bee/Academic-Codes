import java.io.IOException;

import java.util.Scanner;
public class Task1040 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double average = ( (N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1) ) / ( 2+3+4+1); 
        
        if(average >= 7.0)
        {
            System.out.printf("Media: %.1f%n",average);
            System.out.printf("Aluno aprovado.%n");
            
        }
        else if(average < 5.0)
        {
            System.out.printf("Media: %.1f%n",average);
            System.out.printf("Aluno reprovado.%n");
        }
        else if(average>=5.0 && average<=6.9)
        { 
            System.out.printf("Media: %.1f%n",average);
            System.out.printf("Aluno em exame.%n");
            double anotherScore = sc.nextDouble();
            double newAverage = (average + anotherScore) / 2.0;
            System.out.printf("Nota do exame: %.1f%n", anotherScore);
            
            if(newAverage >= 5.0)
            {
                System.out.printf("Aluno aprovado.%n");
                System.out.printf("Media final: %.1f%n", average);
            }
            else if(newAverage <= 4.9)
            {
                System.out.printf("Aluno reprovado.%n");
                System.out.printf("Media final: %.1f%n", newAverage);
            }     
        }
    }
}    