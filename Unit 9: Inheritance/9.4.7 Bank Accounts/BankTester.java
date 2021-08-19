public class BankTester {
    public static void main(String[] args) {
        StudentAccount student = new StudentAccount("student", 100);
        Account account = new Account("account", 200);
        System.out.println(student);
        System.out.println(account);
    }
}
