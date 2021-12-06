package JavaIO;

import java.io.File;

class DirectoryDemo {
    public static void main(String args[]) {
        String dirname = "dir";
        File f1 = new File(dirname);

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            File s[] = f1.listFiles();

            for (File f : s) {
                //File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(f.getName() + " is a directory");
                } else {
                    System.out.println(f.getName() + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}
