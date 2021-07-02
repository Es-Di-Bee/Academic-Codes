public class lineEnterAndFormatStrings {
    public static void main(String[] args) {
        //method 1 starts
        System.out.println("Shadab");
        System.out.println("Iqbal");
        System.out.println(); // this is a space
        //method 2 starts
        System.out.printf("Shadab%nIqbal");
        System.out.println(); //this is a space
        //method 3 starts
        System.out.printf("%s %d %f", "Shadab Iqbal", 1072, 20.0);
        // ^^ declaring the string, integer and float, inside
        //method 4 starts
        String firstName = "Shadab";
        String secondName = "Iqbal";
        int id = 1072;
        float marks = 20;
        int sumOfMarks = 87;
        double avg = ((double)sumOfMarks) / marks;
        System.out.printf("%n Student %s %s having id %d recieved %f marks and his average is %f", firstName, secondName, id, marks, avg);
        //by following method 3, decimals of large numbers are obtained
        //method 5 starts
        System.out.printf("%n Student %s %s having id %d recieved %.2f marks and his average is %.2f", firstName, secondName, id, marks, avg);
        // ^^ now the decimal has been limited just upto 2 decimals 
        //method 6 starts
        System.out.printf("%n Student %s %s having id %d recieved %.0f marks and his average is %.0f", firstName, secondName, id, marks, avg);
        // ^^ now there is no decimal, just the integer
        System.out.printf("%n Student %S %S having id %d recieved %.0f marks and his average is %.0f", firstName, secondName, id, marks, avg);
        // capital S uppercases all the letter of the name
        System.out.printf("%n Student %S %S having id %,d recieved %.0f marks and his average is %.0f", firstName, secondName, id, marks, avg);
        //commma is for comma grouping seperators
        //method 7 starts
        String str = String.format("%n Student %S %S having id %,d recieved %.0f marks and his average is %.0f", firstName, secondName, id, marks, avg);
        System.out.println(str);
        // ^^ here, a string class is created using static format method. A new string variable is created.
    }
}
    
