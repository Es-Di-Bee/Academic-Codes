public class Student {
    private String name = "";
    private String id = "";
    private String address = "";
    private double cgpa = 0.0;
    
    public Student() { // using manual constructor
    }
    public Student(String name, String id) { // using a 
        this.name = name;                    // parameterized constructor 
        this.id = id;
    }
    
    public void setName(String n ) {
        this.name = n;
    }
    public String getName() {
        return this.name;
    }
    public void setID(String i) {
        this.id = i;
    } 
    public String getID() {
        return this.id;
    }
    public void setAddress(String a) {
        this.address = a;
    }
    public String getAddress() {
        return this.address;
    }
    public void setCGPA(double c) {
        this.cgpa = c;
    }
    public double getCGPA() {
        return this.cgpa;
    }
}