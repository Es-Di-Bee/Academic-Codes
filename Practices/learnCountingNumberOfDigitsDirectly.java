public class learnCountingNumberOfDigitsDirectly
{
    public static void main(String[] args) {
        int n = 2134;
        int length = Integer.toString(n).length();
        System.out.println(length);
        
        //or 
        
        int length2 = (int)Math.log10(n+1); //int has to be casted to avoid the decimal
        System.out.println(length2);
        
    }
}
        
        