public class Task3 {
    static int[] a = {10,20,30,40,50,60,70,80,90,100};
    
    public static void main(String[] args) {
        print(a, a.length);
    }

    public static int print(int[] a, int size) {
        int index = a.length - size;
        if(index == a.length){
            return 0;
        }
        System.out.println(a[index]);
        print(a, --size);
        return 0;
    }
}
