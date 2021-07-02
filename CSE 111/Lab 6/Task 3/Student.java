public class Student {
        private String name = "Ei name e kono student nai";
        private String id = "Student ei nai, abar id :P";
        private String address = "Naam nai .. thikana ashbe koi theke?";
        private double cgpa = -4.0;
        public Student() {
        }
        public Student(String n, String i, String a, double c) {
                this.name = n;
                this.id = i;
                this.address = a;
                this.cgpa = c;
        }
        public String nameDao() {
                return this.name;
        }
        public String boloToAmiKe() {
                return this.id;
        }
        public String addressDao() {
                return this.address;
        }
        public double cgpaDao() {
                return this.cgpa;
        }
        public void nameBoshao(String n) {
                this.name = n;
        }
        public void idBoshao(String i) {
                this.id = i;
        }
        public void addressBoshao(String a) {
                this.address = a;
        }
        public void cgpaBoshao(double c) {
                this.cgpa = c;
        }
        public void standUp() {
                System.out.println(this.name + " is now standing up!!");
        }
        public String tellMeYourName() {
                String str = "Sir, my name is " + this.name;
                return str;
        }
        public void call(String n) {
                System.out.println(this.name + ": Hey, " + n + ", Sir is calling you!!");
        }
        public int add2Numbers(int x, int y) {
                return x + y;
        }
}