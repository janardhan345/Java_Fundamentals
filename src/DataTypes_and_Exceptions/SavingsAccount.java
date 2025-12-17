package DataTypes_and_Exceptions;

public class SavingsAccount {
        private String accountNo;
        // private field 
        private double balance;

        public String getAccountNo() {
            return accountNo;
        }
        // getter
        public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
        }


        public double getBalance() {
            return balance;
        }

        // setter 
        public void setBalance(double balance) {
            // single parameter 
            this.balance = balance;
        }
    }
