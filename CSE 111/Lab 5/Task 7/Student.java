public class Student {
        public static int numberOfStudents = 0;
        private String name = "";
        public Student() {
                this.name = "default name";
                ++numberOfStudents;
        }
        public Student(String n) {
                this.name = n;
                ++numberOfStudents;
        }
        public String getName() {
                return this.name;
        }
}