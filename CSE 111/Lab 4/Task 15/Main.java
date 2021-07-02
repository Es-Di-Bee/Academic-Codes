public class Main {
    public static void main(String[] args) {
        BoroInt num1 = new BoroInt(); // testing constructor 1
        System.out.println(num1.val);
        
        BoroInt num2 = new BoroInt("24=23^%4-1:35]32#$^4"); // testing constructor 2
        
        BoroInt num3 = new BoroInt("435"); // testing constructor 3
        System.out.println(num3.val);
        
        BoroInt num4 = new BoroInt(num3); // testing constructor 4
        System.out.println(num4.val);
        
        System.out.println(num4.trim("12 4 234 5")); // testing method 1
        
        System.out.println(num2.validValue("24=23^%4-1:35]32#$^4")); // testing 
        System.out.println(num3.validValue("345"));                  // method 2
        
        BoroInt num5 = new BoroInt("23736"); // setting two number 
        BoroInt num6 = new BoroInt("6859");  // for doing the calculations
        
        BoroInt sum = new BoroInt(num5.add(num6)); // adding big integers
        System.out.println(sum.val);
        
        BoroInt dif = new BoroInt(num5.subtract(num6)); // subtracting big integers
        System.out.println(dif.val);
        
        BoroInt prod = new BoroInt(num5.multiply(num6)); // multiplying big integers
        System.out.println(prod.val);
        
        BoroInt div = new BoroInt(num5.divide(num6)); // dividing big integers
        System.out.println(div.val);
         
    }
}