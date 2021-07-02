public class Teacher {
    private String name = "";
    private String dept = "";
    public String course = "";
    public Teacher() {
    }
    public Teacher(String n, String d) {
        this.name = n;
        this.dept = d;
    }
    public void addCourse(Course c) {
        this.course += "\n" + c.subject;
    }
    public void printDetail() {
        System.out.println("========================");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("List of Course");
        System.out.print("========================");
        System.out.print(course);
        System.out.println();
        System.out.println("========================");
    }
}