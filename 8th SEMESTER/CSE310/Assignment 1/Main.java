import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String red = "\u001B[31m";
        String reset = "\u001B[0m";
        String green = "\u001B[32m";
        Student[] s = new Student[12];
        int cfs = 0;
        while (true) {
            System.out.println("Enter '1' to Student Login");
            System.out.println("Enter '2' to Faculty Login");
            System.out.println("Enter '3' to Student Register");
            System.out.println("Enter '0' to exit the program\n");

            String input = sc.nextLine();
            if (input.equals("0")) {
                System.out.println(green + "Thank you for using the program.\n" + reset);
                break;
            } else if (input.equals("1")) {
                System.out.println("\nPlease Enter your Email");
                String e = sc.nextLine();
                System.out.println("\nPlease Enter your Password");
                String p = sc.nextLine();
                for (int i = 0; i < s.length; ++i) {
                    if (i == cfs) {
                        System.out.println(red + "\nYou are not Registered. Please Register first\n" + reset);
                        break;
                    }
                    Student st = s[i];
                    if (st.getEmail().equals(e) && st.getPassword().equals(p)) {
                        System.out.println(green + "\nYou have Successfully logged in\n" + reset);
                        while (true) {
                            System.out.println(green + "1\tSection-01\tSunday: 12:30 pm 1:00 pm\t" + Section.sec1Seats() + " seats remaining");
                            System.out.println("2\tSection-02\tSunday: 02:30 pm 4:00 pm\t" + Section.sec2Seats() + " seats remaining" + reset);
                            System.out.println("\nEnter '1' for enrolling in Section 01");
                            System.out.println("Enter '2' for enrolling in Section 02");
                            System.out.println("Enter '0' for logging out\n");
                            String inp = sc.nextLine();
                            if (inp.equals("1")) {
                                try {
                                    Section.sec1enroll(st);
                                    break;
                                } catch (Exception ex) {
                                    System.out.println(red + "Seat Limit reached for section 01\nPlease select another Section\n" + reset);
                                }
                            } else if (inp.equals("2")) {
                                try {
                                    Section.sec2enroll(st);
                                    break;
                                } catch (Exception ex) {
                                    System.out.println(red + "Seat Limit reached for section 02\nPlease select another Section" + reset);
                                }
                            } else if (inp.equals("0")) {
                                System.out.println(red + "You have successfully logged out. Thank you\n" + reset);
                                break;
                            } else {
                                System.out.println(red + "Please choose a valid section" + reset);
                            }
                        }
                        break;
                    }

                }
            } else if (input.equals("2")) {
                System.out.println("\nPlease enter your username");
                String usr = sc.nextLine();
                System.out.println("\nPlease enter your password");
                String pass = sc.nextLine();
                if (usr.equals("admin") && pass.equals("admin")) {
                    System.out.println("\nPress '1' to see info of students of Section 01");
                    System.out.println("Press '2' to see info of students of Section 02\n");
                    String inp = sc.nextLine();
                    if (inp.equals("1")) {
                        Section.showInfo(1);
                    } else if (inp.equals("2")) {
                        Section.showInfo(2);
                    } else {
                        System.out.println("\nPlease select a valid section");
                    }
                } else {
                    System.out.println(red + "\nPlease enter valid username and password\n" + reset);
                }
            } else if (input.equals("3")) {
                if (cfs == 12) {
                    System.out.println(red + "Sorry, Number of students is full.\n" + reset);
                    continue;
                }
                System.out.println("\nPlease enter your Name");
                String name = sc.nextLine();
                System.out.println("\nPlease enter your SID");
                String sid = sc.nextLine();
                System.out.println("\nPlease enter your Email");
                String email = sc.nextLine();
                System.out.println("\nPlease enter your Password");
                String password = sc.nextLine();
                s[cfs++] = new Student(name, sid, email, password);
                System.out.println(green + "\nYou have Successfully Registered\n" + reset);
            } else {
                System.out.println(red + "You have given WRONG input. Please try again\n" + reset);
            }
        }
    }
}
