class Sphere extends Point {
    public Sphere(double r) {
        super(r);
    }
    
    public double space () {
        System.out.println("Creating a Sphere … done!");
        return  (4/3.0) * 3.1416 * getRadius() * getRadius() * getRadius() ;
    }
}