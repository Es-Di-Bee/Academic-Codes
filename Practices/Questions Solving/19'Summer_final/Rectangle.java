import java.lang.Math;
public class Rectangle extends Shape {
      int length = 0;
      int width = 0;
      
      public Rectangle(int l, int w) {
            this.length = l;
            this.width = w;
      }
      
      public double getArea() {
            return length*width;
      }
}