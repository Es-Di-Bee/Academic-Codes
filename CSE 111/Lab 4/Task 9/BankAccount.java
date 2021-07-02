public class BankAccount {
        private String name = "";
        private String address = "";
        private String accountID = "";
        private double balance = 0.0;
        
        public BankAccount() {
        }
        
        public BankAccount(String name, double balance) {
                this.name = name;
                this.balance = balance;
        }
        
        public void setName(String n) {
                name = n;
        }
        public String getName() {
                return name;
        }
        public void setAccountID(String i) {
                accountID = i;
        }
        public String getAccount() {
                return accountID;
        }
        public void setAddress(String a) {
                address = a;
        }
        public String getAddress() {
                return address;
        }
        public void setBalance(double c) {
                balance = c;
        }
        public double getBalance() {
                return balance;
        }
        public double addInterest(double balance) {
                balance += (balance * 0.07);
                return balance;
        }
}




