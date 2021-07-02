public abstract class Account{
    private static long accountNumber = 100;
    private String name;
    private long accNumber;
    private double balance;
    
    public Account(String name){
        this.name = name;
        accNumber = accountNumber++;
        balance = 0.0;
    }
    
    public abstract void printAccountInfo();
    
    protected String getName(){
        return name;
    }  
    protected double getBalance(){
        return balance;
    }
    protected void setBalance(double bal){
        if (bal > 0){
            balance = bal;
        }
    }  
    protected long getAccountNumber(){
        return accNumber;
    }
    
}

