class Cat extends Animal {
    public Cat(String s) {
        super(s);
    }
    public void makeNoise() {
        System.out.println(super.getName() + " is Meowwwing");
    }
}