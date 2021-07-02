public class QueueUnderflowException extends Exception {
    public QueueUnderflowException() {
        super();
        System.out.println("Queue Empty");
    }
}
