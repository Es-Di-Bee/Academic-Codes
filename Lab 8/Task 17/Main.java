import java.util.Scanner;
import java.util.Vector;
public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int xLimit = sc.nextInt();
                int yLimit = sc.nextInt();
                Vector v1 = new Vector();
                Vector v2 = new Vector ();
                while(sc.hasNext()) {
                        int x = sc.nextInt();
                        int y = sc.nextInt();
                        char orientation = sc.next().charAt(0);
                        sc.nextLine();
                        String str = sc.nextLine();
                        int d = 0;
                        boolean flag = false;
                        if (orientation == 'N') d = 1; if (orientation == 'E') d = 2; if (orientation == 'S') d = 3; if (orientation == 'W') d = 4;
                        for (int i = 0; i < str.length(); ++i) {
                                if (str.charAt(i) == 'R') {
                                        ++d;
                                        if (d == 5) d = 1;
                                } else if (str.charAt(i) == 'L') {
                                        --d;
                                        if (d == 0) d= 4;
                                } else {
                                        if(d == 1) {
                                                if (y+1 <= yLimit) ++y;
                                                else {
                                                        if(v2.contains(y)) continue;
                                                        v2.add(y);
                                                        flag = true;
                                                        break;
                                                }
                                        } else if (d == 2) {
                                                if (x+1 <= xLimit) ++x;
                                                else {
                                                        if(v1.contains(x)) continue;
                                                        v1.add(x);
                                                        flag = true;
                                                        break;
                                                }
                                        } else if (d == 3) {
                                                if(y-1 >= 0) --y;
                                                else {
                                                        if(v2.contains(y)) continue;
                                                        v2.add(y);
                                                        flag = true;
                                                        break;
                                                }
                                        } else {
                                                if(x-1 >= 0) --x;
                                                else {
                                                        if(v1.contains(x)) continue;
                                                        v1.add(x);
                                                        flag = true;
                                                        break;
                                                }
                                        }
                                }
                        }
                        if (d==1) orientation = 'N'; if (d==2) orientation = 'E'; if (d==3) orientation = 'S'; if (d==4) orientation = 'W';
                        if (flag == false) System.out.println(x + " " + y + " " + orientation);
                        else System.out.println(x + " " + y + " " + orientation + " LOST");
                }
        }
}