public class rightAndLeftJustified {
    public static void main(String[] args) {
        int num1 = 2000;
        System.out.printf("%d %n", num1);
        System.out.printf("%6d %n", num1);
        /* ^^ to make the changes visible, padding should be done in such a way that the number inputted for padding is greater than the 
        digits of the real given number. for example, 2000 has 4 digits. so to make the changes visible, padding should be done with a 
        number >4 */ 
        System.out.printf("%06d%n", num1);
        // ^^ adds zeroes, if after padding, there are more spaces to fill
        double num2 = 15.54;
        System.out.printf("%10f %n", num2);
        // ^^ minimum 10 right shifting should be done to make the change visible, if there is no precision
        System.out.printf("%5.1f %n", num2);
        // ^^ points are also considered when padding
    }
}
                                           
                                           