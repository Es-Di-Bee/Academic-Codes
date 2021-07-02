public class ComplexDemo {
    public static void main(String[] args) {
        Complex num1 = new Complex();
        num1.setRealPart(20.0);
        num1.setImaginaryPart(-4.0);
        
        Complex num2 = new Complex(3.0, -7.0);
        
        Complex sumResult = num1.add(num2);
        System.out.println(sumResult.toString());
        
        Complex difResult = num1.subtract(num2);
        System.out.println(difResult.toString());
        
        Complex prodResult = num1.multiply(num2);
        System.out.println(prodResult.toString());
        
        Complex divResult = num1.divide(num2);
        System.out.println(divResult.toString());
    }
}