public class studentMain {
    public static void main(String[] args) {
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();
        john.setName("Jonathan");
        john.setID("19101072");
        john.setAddress("Stranger Things");
        john.setCGPA(3.68);
        mike.setName("Michael");
        mike.setID("19101085");
        mike.setAddress("Peaky Blinders");
        mike.setCGPA(3.53);
        carol.setName("Carolin");
        carol.setID("19101087");
        carol.setAddress("Ojopara Geraam");
        carol.setCGPA(3.57);
        System.out.println(john.getName()+" whose id is "+john.getID()+" and CGPA is "+john.getCGPA()+ " lives at "+john.getAddress());
        System.out.println(mike.getName()+" whose id is "+mike.getID()+" and CGPA is "+mike.getCGPA()+ " lives at "+mike.getAddress());
        System.out.println(carol.getName()+" whose id is "+carol.getID()+" and CGPA is "+carol.getCGPA()+ " lives at "+carol.getAddress());
        
        Student s4 = new Student("Shadab", "19101072"); // passing parameters through constructor
        System.out.println(s4.getName() + " " + s4.getID());
    }
}
