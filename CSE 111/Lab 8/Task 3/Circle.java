class Circle extends Point {
    public Circle(double r) {
        super(r);
    }
    
    public double space () {
        System.out.println("Creating a Circle … done!");
        return Math.acos(-1) * getRadius() * getRadius();
    }
}