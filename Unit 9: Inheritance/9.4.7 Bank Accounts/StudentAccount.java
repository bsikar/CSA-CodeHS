public class StudentAccount extends Account {
    public StudentAccount(String studentName, double openingBal) {
        super(studentName, openingBal);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount + 1);
    }

    @Override
    public void withdrawal(double amount) {
        super.withdrawal(amount + 2);
    }

    @Override
    public String toString() {
        return "Student account with a balance of $" + super.getBalance();
    }
}

