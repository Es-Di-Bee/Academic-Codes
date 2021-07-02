import java.math.*;
public class bigIntegerAddition {
    public static void main(String[] args) {
        BigInteger bi1, bi2, bi3;  
        bi1 = new BigInteger("123");
        bi2 = new BigInteger("50");
        // ^^ way of writing integer like bigInteger
        bi3 = bi1.add(bi2);
        String str = "Result of addition is " + bi3; // creating a string directly adding the variable
        System.out.println(str);
    }
}