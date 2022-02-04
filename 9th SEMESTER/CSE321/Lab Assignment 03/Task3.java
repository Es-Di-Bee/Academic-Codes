public class Task3 extends Thread {

    static long[] fib_series = new long [50];
    static double mean1;
    static double mean2;
    static double mean3;
    static double mean4;
    static double final_mean;

    Task3(String name) {
        super(name);
    }

    @Override
    public void run() {
        if (getName().equals("task 1")) task1();
        if (getName().equals("task 2")) task2();
        if (getName().equals("task 3")) task3();
        if (getName().equals("task 4")) task4();
        if (getName().equals("task 5")) task5();
    }

    void task1() {
        long sum = 0;
        double c = 0.0;
        for (int i = 0; i < fib_series.length / 2; ++i) {
            if (fib_series[i] % 2 != 0) {
            	sum += fib_series[i];
            	++c;
            }
        }
        mean1 = sum / c;
    }

    void task2() {
        long sum = 0;
        double c = 0.0;
        for (int i = 0; i < fib_series.length / 2; ++i) {
            if (fib_series[i] % 2 == 0) {
            	sum += fib_series[i];
            	++c;
            }
        }
        mean2 = sum / c;
    }

    void task3() {
        long sum = 0;
        double c = 0.0;
        for (int i = fib_series.length / 2; i < fib_series.length; ++i) {
            if (fib_series[i] % 2 != 0) {
            	sum += fib_series[i];
            	++c;
            }
        }
        mean3 = sum / c;
    }

    void task4() {
        long sum = 0;
        double c = 0.0;
        for (int i = fib_series.length / 2; i < fib_series.length; ++i) {
            if (fib_series[i] % 2 == 0) {
            	sum += fib_series[i];
            	++c;
            }
        }
        mean4 = sum / c;
    }

    void task5() {
        final_mean = (mean1 + mean2 + mean3 + mean4) / 4.0;
        System.out.println("The PIN i.e Special integer: " + (int)final_mean);
    }

    public static void main(String[] args) {
        fib_series[0] = 0; fib_series[1] = 1;
        for (int i = 2; i < fib_series.length; ++i) {            // generating the
            fib_series[i] = fib_series[i-1] + fib_series[i-2];   // fibonacci series
        }

        Task3 thread1 = new Task3("task 1");
        Task3 thread2 = new Task3("task 2");
        Task3 thread3 = new Task3("task 3");
        Task3 thread4 = new Task3("task 4");
        Task3 thread5 = new Task3("task 5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread5.start();
    }
}