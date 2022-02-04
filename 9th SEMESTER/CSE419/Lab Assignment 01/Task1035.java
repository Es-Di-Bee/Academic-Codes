import java.io.IOException;

import java.util.Scanner;
public class Task1035 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        if(B > C)
        {
            if(D > A)
            {
                if((C + D) > (A + B))
                {
                    if(C > 0 && D > 0)
                    {
                        if(A % 2 == 0)
                        {
                            System.out.println("Valores aceitos");
                        }
                        else 
                        {
                            System.out.println("Valores nao aceitos");
                        }
                    }
                    else 
                    {
                        System.out.println("Valores nao aceitos");
                    }
                }
                else 
                {
                    System.out.println("Valores nao aceitos");
                }
            }
            else 
            {
                System.out.println("Valores nao aceitos");
            }
        }
        else 
        {
            System.out.println("Valores nao aceitos");
        }
    }
    
}