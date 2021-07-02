public class Task2 {
    //this code is done in memoization recursion style
   
    static int[] a = new int[100];
    
    public static void main(String[] args) {
        for(int i = 0; i < a.length; ++i) a[i] = -1;
        
        int num = fib(10);
        System.out.println(num);
    }

    private static int fib(int n) {
        if (n <= 1) return a[n] = n;
        
        if(a[n] > -1) return a[n];
        
        return a[n] = fib(n-1) + fib(n-2);
    }

}
