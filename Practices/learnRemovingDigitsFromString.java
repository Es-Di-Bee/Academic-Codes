public class learnRemovingDigitsFromString {
    public static void main (String[] args) {
        
        String str = "qwe27asd19"; //inputting a string containing digits
        String output = str.replaceAll("\\d+", ""); // replacing "\\d+" with blank, here \\d+ means anything other than letters
        System.out.println(output);
        // or
        String output2 = str.replaceAll("[^A-Za-z]+", "");
        System.out.println(output2);
        // or
        String output3 = str.replaceAll("[0-9]+", ""); // the '^' sign indicates ONLY THE DIGITS will be removed
        String output4 = str.replaceAll("[^0-9]+", ""); // the '^' sign indicates ANYTHING OTHER THAN DIGITS will be removed
        System.out.println(output3);
        System.out.println(output4);
    }
}