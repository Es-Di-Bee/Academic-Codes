public class Student implements STInterface {
    
    private String name  = "";
    private int ID = 0;
    protected String address = "";
    
    public Student(String n, int i, String a) {
        setName(n);
        setID(i);
        this.address = a;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setID(int i) {
        ID = i;
    }
    
    public String getName() {
        return name;
    }
    
    public int getID() {
        return ID;
    }
    
}