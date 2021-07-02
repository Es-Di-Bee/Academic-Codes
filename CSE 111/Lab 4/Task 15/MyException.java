public class MyException extends Exception {
    public String msg = "";
    public MyException() {
    }
    public MyException (String s){
        this.msg = s;
    }
}