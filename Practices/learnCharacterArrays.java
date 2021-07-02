public class learnCharacterArrays {
    public static void main (String[] args) {
        char[] a = {'a', 's', 'd', 'f'}; // creating a character array
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " "); // printing a character array simply
        }
        System.out.println();
        
        String str = "asdf"; // inputting a string simply
        char[] b = str.toCharArray(); // converting the string into a character array
        for (char i : b) {
            System.out.print(i + " "); // different method for printing a character array
        }
        System.out.println();
        
    }
}