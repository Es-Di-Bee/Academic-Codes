public class Square extends Rectangle {
        public Square() {
        }
        public Square(double s) {
                width = s;
                length = s;
        }
        public Square(double s, String c, boolean f) {
                width = s;
                length = s;
                color = c;
                filled = f;
        }
        
        public double getSide() {
                return length;
        }
        
        public void setSide(double s) {
                length = s;
                width = s;
        }
        
        public void setWidth(double w) {
                width = w;
        }
        
        public void setLength(double l ){ 
                length = l;
        }
        
        public String toString() {
                return "A square with sides  " + getSide() + " is " + filled + " with " + color;
        }
}