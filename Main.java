public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("1001", "Shriyam", 1000.0);
        BankAccount account2 = new BankAccount("1002", "Sumit", 500.0);

        System.out.println("Account 1 operations:");
        account1.deposit(250.0);
        account1.withdraw(800.0);

        System.out.println("\nAccount 2 operations:");
        account2.deposit(300.0);
        account2.withdraw(900.0);

        System.out.println("\nAccount 1 details:");
        account1.displayDetails();

        System.out.println("\nAccount 2 details:");
        account2.displayDetails();
    }
}
