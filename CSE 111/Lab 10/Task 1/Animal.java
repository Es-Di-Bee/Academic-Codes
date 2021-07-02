public class Animal {
    private String name = "default name";
    public Animal(String s) {
        name = s;
    }
    public String getName() {
        return name;
    }
    public void makeNoise() {
        System.out.println("default noise");
    }
}