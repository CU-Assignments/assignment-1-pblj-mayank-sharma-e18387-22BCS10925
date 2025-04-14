import java.util.Scanner;

class BankAccount {
    public String name;
    public int accountNumber;
    private double balance;

    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, balance);

        System.out.print("Deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        sc.close();
    }
}
}
