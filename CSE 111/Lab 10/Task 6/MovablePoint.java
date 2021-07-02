public class MovablePoint implements Movable {
        public int x = 0;
        public int y = 0;
        public int xSpeed = 0;
        public int ySpeed = 0;
        
        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
                this.x = x;
                this.y = y;;
                this.xSpeed = xSpeed;
                this.ySpeed = ySpeed;
        }
        
        public MovablePoint(int x, int y, int xSpeed, int ySpeed, int radius) {
                
        }
        
        public void moveUp() {
                y += ySpeed;
        }
        
        public void moveDown() {
                y -= ySpeed;
        }
        
        public void moveLeft() {
                x -= xSpeed;
        }
        
        public  void moveRight() {
                x += xSpeed;
        }
        
        public String toString() {
                return String.format("The point has now a coordinate of %+d and %+d", x, y);
        }
}