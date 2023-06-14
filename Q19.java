class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private String accountNumber;
    private double balance;

    public SavingsAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw amount.");
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully. New balance: " + balance);
    }
}

public class Q19 {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("1234567890", 1000.0);

        try {
            account.depositAmount(500.0);
            account.withdrawAmount(300.0);
            account.withdrawAmount(1500.0); // This will throw an exception
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
