class Employee extends Person{
    private double salary = 0.0;
    private int startYear = 0;
    private String insurance = "default insurance no.";
    public Employee(String name, double s, int y, String i) {
        super(name);
        salary = s;
        startYear = y;
        insurance = i;
    }
    public double getSalary() {
        return salary;
    }
    public int getStartYear() {
        return startYear;
    }
    public String getInsurance() {
        return insurance;
    } 
}