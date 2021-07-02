public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("shadab", 70000.00, 2022, "asd345gy7");
        System.out.println(e1.name);
        System.out.println(e1.getSalary());
        System.out.println(e1.getStartYear());
        System.out.println(e1.getInsurance());
    }
}