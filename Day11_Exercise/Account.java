package Day11_Exercise;

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //Adds the specified amount to the balance and returns the new balance
    public int credit(int amount) {
        return balance += amount;
    }

    //Deducts the specified amount from the balance and returns the new balance
    public int debit(int amount) {
        if (amount <= balance) {
            return balance -= amount;
        } else {
            System.out.println("- Insufficient balance");
            return -1;
        }
    }

    //Transfers the specified amount from this account to another account and returns the new balance of this account
    public int transferTo(Account another, int amount) {
        if(amount <= balance) {
            another.credit(amount);
            return balance -= amount;
        } else {
            System.out.println("- Insufficient balance");
            return -1;
        }
    }

    @Override
    public String toString() {
        return "\nid = " + id +
                "\nname = " + name +
                "\nbalance = " + balance;
    }
}
