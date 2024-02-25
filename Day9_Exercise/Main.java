package Day9_Exercise;

public class Main {

    public static void main(String[] args) {

        //Account operations
        Account account1 = new Account("ACC001", "Deema", 1000);
        Account account2 = new Account("ACC002", "Sara");

        System.out.println("*** Account Details ***");
        System.out.println("Account 1: " + account1 + "\n");
        System.out.println("Account 2: " + account2 + "\n");

        System.out.println("*** Account 1 Transactions ***");
        System.out.println("- Initial balance: " + account1.getBalance());
        System.out.println("- Crediting 500...");
        account1.credit(500);
        System.out.println("- New balance after credit: " + account1.getBalance());
        System.out.println("- Debiting 200...");
        account1.debit(200);
        System.out.println("- New balance after debit: " + account1.getBalance() + "\n");

        System.out.println("*** Transferring 300 from Account 1 to Account 2 ***");
        System.out.println("- Balances before transfer:");
        System.out.println("  Account 1: " + account1.getBalance());
        System.out.println("  Account 2: " + account2.getBalance());
        account1.transferTo(account2, 300);
        System.out.println("- Balances after transfer:");
        System.out.println("  Account 1: " + account1.getBalance());
        System.out.println("  Account 2: " + account2.getBalance());

        //Employee operations
        Employee employee1 = new Employee("EMP011", "Deema", 50000);

        System.out.println("\n*** Employee Details ***");
        System.out.println(employee1);
        System.out.println("Annual salary: " + employee1.getAnnualSalary() + "\n");

        System.out.println("*** Raising salary by 10% ***");
        employee1.raisedSalary(10);
        System.out.println("New salary: " + employee1.getSalary());

    }
}
