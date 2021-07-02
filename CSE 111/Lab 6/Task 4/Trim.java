public class Trim{
        public static char[] trim(char[] input){
                int c  = 0;
                for (int i = 0; i < input.length; ++i) {
                        if (input[i] == ' ') {
                                if (input[i-1] == ' ') {
                                        ++c;
                                }
                        }
                }
                
                char[] a = new char[input.length - c];
                int count = 0;
                for (int i = 0; i < input.length; ++i) {
                        if (input[i] != ' ') {
                                a[count] = input[i];
                                ++count;
                        }  else {
                                a[count] = ' ';
                                ++count;
                                while (input[i] == ' ' && i < input.length) {
                                        ++i;
                                }
                                --i;
                        }
                }
                return a;
        }
        public static void main(String [] args){
                char [] input = {'T', 'h' ,'i' ,'s', ' ', ' ', ' ', ' ', ' ', 'i', 's', ' ', ' ', ' ', ' ', 'a', ' ', ' ', ' ', ' ', 't', 'e', 's', 't', '.'};
                
                for (int i = 0; i< input.length; i++){
                        System.out.print(input[i]);
                }
                System.out.println("");
                
                char []  output = trim(input);
                
                for (int i = 0; i< output.length; i++){
                        System.out.print(output[i]);
                }
                System.out.println("");    
        }
}
