class Point {
    private double radius;
    public Point (double r) {
        radius = r;
    }
    public double space ( ) {
        System.out.println("Space for a Point can’t be defined");
        return 0;
    }
    protected double getRadius(){
        return radius;
    }
}
