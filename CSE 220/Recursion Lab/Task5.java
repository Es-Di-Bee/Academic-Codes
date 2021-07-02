import java.lang.Math;
public class Task5 {
    public static void main(String[] args) {
        Long result = product(3L, 5L);
        System.out.println(result);
    }

    public static Long product(Long m, Long n) {
        if (n == 0) return 1L;
        return m * product(m, --n);
    }
}


