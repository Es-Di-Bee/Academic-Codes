import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10,20,30,40,50,60,70};
        System.out.println("Press 1 for ITERATIVE SEARCHING or press 2 for RECURSIVE SEARCHING");
        int x = sc.nextInt();
        int foundAt = 0;
        if (x == 1) {
            foundAt = iterative(a, 30);
        } else if (x == 2) {
            foundAt = recursive(a, 50, 0, a.length-1);
        } else System.err.println("Wrong Input");
        if (foundAt != -1) System.out.println("Found at Index " + foundAt);
        else System.out.println("The element is not found");
    }

    private static int iterative(int[] a, int elem) {
        int l = 0;
        int r = a.length-1;
        while(l <= r) {
            int mid = (l+r) / 2;
            if (a[mid] == elem) return mid;
            else if (a[mid] > elem) r = mid-1;
            else l = mid+1;
        }
        return -1;
    }

    private static int recursive(int[] a, int elem, int l, int r) {
        if (l > r) return -1;
        int mid = (l+r) / 2;
        if (a[mid] > elem) return recursive(a, elem, l, mid-1);
        else if (a[mid] < elem) return recursive(a, elem, mid+1, r);
        return mid;
    }
}
