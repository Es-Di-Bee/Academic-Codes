public class Paint {
        public static double coverage = 0.0;
        
        public Paint(double c) {
                coverage = c;
        }
        
        public static  double amount(double area) {
                return (area / coverage);
        }
}