
class Practical10 {
    public static void main(String[] args) {
        BankAccount10 account = new BankAccount10("Rahul", "12345", 5000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        System.out.println();

        account.deposit(2000);
        account.deposit(-500);
        account.withdraw(1000);
        account.withdraw(0);
        account.withdraw(10000);

        System.out.println("\nUpdated Balance: " + account.getBalance());
    }
}

class BankAccount10 {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount10(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = Math.max(0, balance);
    }

    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }
}
