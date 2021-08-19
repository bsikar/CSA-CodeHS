public class Account {
    private String name;
    private double balance;

    public Account(String clientName, double openingBal) {
        name = clientName;
        balance = openingBal;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public String toString() {
        return "Regular account with a balance of $" + balance;
    }
}

