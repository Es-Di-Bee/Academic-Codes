public class learnDigitExtractionFromString {
    public static void main (String[] args) {
        
        String str = "qwe27asd19.36"; //inputting a string containing digits
        String output = str.replaceAll("\\D+", ""); // replacing "\\D+" with blank, here \\D+ means anything other than digits
        System.out.println(output);
        // or
        String output2=str.replaceAll("[^0-9]+", "");
        System.out.println(output2);
        
        String output1 = str.replaceAll("[^0-9?!\\.]", ""); // this syntax is used to keep the decimals 
        System.out.println(output1);
        
    }
}
        