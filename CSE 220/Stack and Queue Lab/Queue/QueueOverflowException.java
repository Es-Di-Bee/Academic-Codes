public class QueueOverflowException extends Exception {
    public QueueOverflowException() {
        super();
        System.out.println("Queue Full! Cannot Enqueue");
    }
}
