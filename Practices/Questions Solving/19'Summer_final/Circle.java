public class Circle extends Shape {
      double radius = 0.0;
      
      public Circle(double r) {
            this.radius = r;
      }
      
      public double getArea() {
            return 3.14*this.radius*this.radius;
      }
}