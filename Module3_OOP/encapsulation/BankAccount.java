package Module3_OOP.encapsulation;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("amount deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("amount withdrawn: " + amount);
        } else {
            System.out.println("insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("1732945", 600000);

        obj.deposit(500);
        obj.withdraw(200);

        System.out.println("current balance: " + obj.getBalance());
    }
}