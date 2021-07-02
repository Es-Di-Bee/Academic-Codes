public class learnReplacingInsideString {
    public static void main (String[] args) {
        
        String str = "He is good";
        String output = str.replace("is", "was"); // replacing a whole word
        System.out.println(output);
        
        String output1 = str.replace("He", "It"); // replacing "he" with "it" first
        String output2 = output1.replace('g', 'f'); // and then replacing the "g" with "f")
        System.out.println(output2);
        
    }
}