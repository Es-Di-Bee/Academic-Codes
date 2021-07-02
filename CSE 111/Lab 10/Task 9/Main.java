public class Main {
    public static void main(String[] args) {
        Student[] a = new Student[3];
        
        a[0] = new Student("Shadab", 19101072, "Bashabo");
        a[1] = new Student("Mitu", 19101085, "Badda");
        a[2] = new Student("Yeasif", 19101087, "Mohakhali");
        
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a.length; ++j) {
                if (a[j].getName().compareToIgnoreCase(a[i].getName()) > 0) {
                    Student temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < a.length; ++i) {
            System.out.println(a[i].getName() + " " + a[i].getID() + " " + a[i].address);
        }
    }
}