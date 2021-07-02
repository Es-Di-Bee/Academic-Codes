import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        File dir = new File("C:\\Users\\User\\Google Drive\\Codes\\CSE 111\\Lab 10\\Task 14");
        String[] files = dir.list();
        System.out.println("Please enter the file name you want to search");
        String fileName = sc.nextLine();
        
        
        for (int i = 0; i < files.length; ++i) {
            if (fileName.equals(files[i])) { // search with '.txt' at the end
                File temp = new File(files[i]);
                sc = new Scanner(temp);
            } 
        }
        
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        
        sc.close();
        
    }
}
    