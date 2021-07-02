public class Main {
        public static void main(String[] args) {
                int[] a = {-2, 5, 2, -7, 78, -155};
                System.out.println(removeNegative(a, a.length));
        }
        // the main class is just for testing
        // below this, is what you should copy in the assingment
        
        public static int removeNegative (int[] a, int length) {
                for (int i = 0; i < length; i++) {
                        boolean flag = false;
                        if (a[i] < 0) {
                                flag = true;
                                if (i < length) {
                                        --length; 
                                        for (int j = i; j < length; j++) {
                                                a[j] = a[j+1]; 
                                        }
                                        a[length] = 0;
                                } 
                        }
                        if (flag == true) {
                                --i;
                        }
                }
                return length;
        }
}
