import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        int newArr[] = appendArrays(arr1, arr2);
        System.out.println(Arrays.toString(newArr));
    }
    
    public static int[] appendArrays(int[] array1, int[] array2) {
        int newArr[] = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < array1.length; ++i, ++index) newArr[index] = array1[i]; 
        for (int i = 0; i < array2.length; ++i, ++index) newArr[index] = array2[i];
        return newArr;
    }   
}