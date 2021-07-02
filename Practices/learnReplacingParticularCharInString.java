public class learnReplacingParticularCharInString {
      public static void main(String[] args) {
            String str = "abcde";
            StringBuilder strb = new StringBuilder(str); // this is stringbuilder class
            strb.setCharAt(2, 'x'); // changing the character which is at 2 with x
            str = strb.toString(); // this is to convert back the stringbuilder to a simple string
            System.out.println(strb);
            System.out.println(str);
      }
}