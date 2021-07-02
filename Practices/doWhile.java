public class doWhile {
    public static void main(String[] args) { 
        int c = 10;
        int i = 20;
        do{
            System.out.println(c);
            c++;
        }while(c<20);
        // ^^ note that there is a semicolon after closing paranthesis
        
        do{
            System.out.println(i);
            i++;
        }while(i<15);
        /* here due to use of 'do' , the operation is executed first for once and then it checked if the condition is true or false 
        and since the condition is false here, the operation ended */
    }
}