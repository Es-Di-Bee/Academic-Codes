public class MovableCircle extends MovablePoint {
        int radius = 0;
        
        public MovableCircle (int x, int y, int xSpeed, int ySpeed, int radius) {
                super(x,y,xSpeed,ySpeed,radius);
                this.x = x;
                this.y = y;
                this.xSpeed = xSpeed;
                this.ySpeed = ySpeed;
                this.radius = radius;
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
                return String.format("The circle's arc is now in the coordinates  %+d, %+d, %+d and %+d", x+radius, y+radius, x-radius, y-radius);
        }
}