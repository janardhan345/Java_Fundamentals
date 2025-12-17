package DataTypes_and_Exceptions;

public class POJO {
        public static void main (String[] args){
            SavingsAccount account = new SavingsAccount();
            account.setAccountNo("12345");
            account.setBalance(50000.00);
            System.out.println("Account " + account.getAccountNo() + " has balance of: " + account.getBalance());
        }
    }

