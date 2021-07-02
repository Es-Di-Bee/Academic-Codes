class Dog extends Animal {
    public Dog(String s) {
        super(s);
    }
    public void makeNoise() {
        System.out.println(super.getName() + " is barking");
    }
}