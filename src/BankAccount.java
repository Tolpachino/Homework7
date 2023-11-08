public class BankAccount {
    double balance;

    public void deposit(double money) {
        balance += money;
    }

    public void withdraw(double money) {
        balance -= money;
    }
}

class BankTest {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.balance = 20.23;
        bankAccount1.deposit(324.123);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.balance= 1234.12312;
        bankAccount2.withdraw(1234);

        System.out.println(bankAccount1.balance);
        System.out.println(bankAccount2.balance);
    }
}
