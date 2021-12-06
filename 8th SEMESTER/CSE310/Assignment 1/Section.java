public class Section {

    private static Student[] s1 = new Student[6]; // s1 = section 1
    private static Student[] s2 = new Student[6]; // s2 = section 2
    private static int sec1seats = 0;
    private static int sec2seats = 0;
    static String reset = "\u001B[0m";
    static String green = "\u001B[32m";

    public static void sec1enroll(Student s) throws Exception{
        s1[sec1seats] = s;
        ++sec1seats;
        System.out.println(green + "\nYou have successfully enrolled in Section 01\n" + reset);
    }

    public static void sec2enroll(Student s) throws Exception{
        s2[sec2seats] = s;
        ++sec2seats;
        System.out.println(green + "\nYou have successfully enrolled in Section 02\n" + reset);
    }

    public static int sec1Seats() {
        return s1.length - sec1seats;
    }

    public static int sec2Seats() {
        return s2.length - sec2seats;
    }

    public static void showInfo(int s) {
        System.out.println();
        if (s == 1) {
            for (Student st : s1) {
                if (st != null) {
                    System.out.println(st.getName() + "\t" + st.getSid());
                }
            }
        } else if (s == 2) {
            for (Student st : s2) {
                if (st != null) {
                    System.out.println(st.getName() + "\t" + st.getSid());
                }
            }
        }
        System.out.println();
    }

}
