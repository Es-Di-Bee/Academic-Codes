public class Car {
    public static int getObjectCount = 0;
    public int year = 0;
    public Car(int y) {
        year = y;
        ++getObjectCount;
    }
    public static int getObjectCount() {
        return getObjectCount;
    }
    public int getYear() {
        return year;
    }
}