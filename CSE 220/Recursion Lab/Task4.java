public class Task4 {
    public static void main(String[] args) {
        String binaryNum = bin(123456789, "");
        StringBuilder str1 = new StringBuilder();
        str1.append(binaryNum);
        str1 = str1.reverse();
        System.out.println(str1);
    }

    public static String bin(int n, String str) {
        if (n == 0) return str;
        str += (n%2);
        return bin(n/2, str);
    }
}
