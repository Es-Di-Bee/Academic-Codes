public class employee
{
    private String theName; // this is a private variable
    public employee(String name) // this is a constructor because the method name is same as the class name
    {
        theName = name; // changing the private variable, by the name given in the parameter of line 7 in the main class
    }
    public String getName()
    {
        return theName; // returning the name 
    }
    public void salaryCalculator(double salary)
    {
        double newSalary = salary + (salary*0.20);
        System.out.print("Increased Salary of " + theName + " is "); // getting theName variable from the private string
        System.out.println(newSalary);
    }
}

    