public class Vehicle2010  extends Vehicle{
        public void moveUpperRight() {
                ++y;
                ++x;
        }
        public void moveUpperLeft() {
                ++y;
                --x;
        }
        public void moveLowerRight() {
                ++x;
                --y;
        }
        public void moveLowerLeft() {
                --x;
                --y;
        }
        public String toString() {
                return String.format("(%d, %d)", x, y);
        }
        public boolean equals(Vehicle2010 v) {
                if(this.x == v.x && this.y == v.y) {
                        return true;
                }
                return false;
        }
 }