public class bankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        acc1.setName("Shadab");
        acc2.setName("Mitu");
        acc3.setName("Yeasif");
        acc1.setAccountID("19101072");
        acc2.setAccountID("19101087");
        acc3.setAccountID("19101085");
        acc1.setAddress("Khilgaon");
        acc2.setAddress("Ashulia");
        acc3.setAddress("Mymensingh");
        acc1.setBalance(5000.0);
        acc2.setBalance(2462.67);
        acc3.setBalance(4369.13);
       
        System.out.println(acc1.getName()+ " having account ID " + acc1.getAccount() + " lives in " + acc1.getAddress() + " and has " + acc1.addInterest(acc1.getBalance()) + " TK ");
        System.out.println(acc2.getName()+ " having account ID " + acc2.getAccount() + " lives in " + acc2.getAddress() + " and has " + acc2.getBalance() + " TK ");
        System.out.println(acc3.getName()+ " having account ID " + acc3.getAccount() + " lives in " + acc3.getAddress() + " and has " + acc3.addInterest(acc3.getBalance()) + " TK ");
        
        BankAccount acc4 = new BankAccount("Promi", 3500.0);
        System.out.println(acc4.getName() + " " + acc4.getBalance());
    }
}