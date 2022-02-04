public class Task2 extends Thread{

    Task2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("The house is :" + getName());
        try {
            if (getName().equals("House Stark") || getName().equals("House Targaryen")) {
                Thread.sleep(1000);
            }
            else if (getName().equals("House Lannister") || getName().equals("House Bolton")) {
                Thread.sleep(3000);
            }
            else {
                Thread.sleep(5000);
            }
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        Task2 thread1 = new Task2("House Stark");
        Task2 thread2 = new Task2("House Targaryen");
        Task2 thread3 = new Task2("House Lannister");
        Task2 thread4 = new Task2("House Bolton");
        Task2 thread5 = new Task2("House Tyrell");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread4.setPriority(Thread.MIN_PRIORITY);

        thread1.run(); // running
        thread2.run(); // in
        thread3.run(); // single threaded
        thread4.run(); // mode

        thread1.start(); // running
        thread5.start(); // in
        thread3.start(); // multi threaded
        thread4.start(); // mode

        try {
            thread1.join(); // waiting for
            thread3.join(); // these threads
            thread4.join(); // to complete their tasks
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (thread1.isAlive()) System.out.println("Not Today!");
        if (!thread4.isAlive()) System.out.println("You know nothing!");

    }
}
