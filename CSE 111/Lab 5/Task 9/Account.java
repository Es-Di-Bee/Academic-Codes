public class Account {
    public static double interestRate = 5.0;
    public String name = "Default Account";
    public double balance = 0.0;
    public Account() {
    }
    public Account(String n, double d) {
        this.name = n;
        this.balance = d;
    }
    public void nameBoshao(String n) {
        name = n;
    }
    public void balanceBoshao(double b) {
        balance = b;
    }
    public String nameKi() {
        return name;
    }
    public double balanceKi() {
        return balance;
    }
    public void withdraw(double w) {
        if (balance-w > 100) {
            balance -= w;
            System.out.println("Withdraw successful! New balance is: "+balance);
        } else {
            System.out.println("The account balance after deducting withdraw amount is\n"+ 
                               "equal to or less than minimum. Cannot withdraw");
        }
    }
}