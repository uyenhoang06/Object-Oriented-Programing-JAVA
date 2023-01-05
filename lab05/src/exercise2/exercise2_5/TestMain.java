package exercise2.exercise2_5;
public class TestMain {
    public static void main(String[] args) {
        // Test Customer class
        Customer customer = new Customer(88, "Tan Ah Teck", 'm'); // Test Constructor
        System.out.println(customer);  // Customer's toString()

        // test Customer's getter
        System.out.println("id is: " + customer.getID());
        System.out.println("name is: " + customer.getName());
        System.out.println("gender is: " + customer.getGender());

        // Test Account class
        Account account = new Account(100, customer, 999); // Test Constructor
        Account acc = new Account(90, customer); // Test Constructor

        account.setBalance(500); // Test setter
        System.out.println("Basic info: " + acc); // Test Account's toString()

        // Test Account's getter
        System.out.println("customer' id is: " + account.getId());
        System.out.println("customer is: " + account.getCustomer());
        System.out.println("customer's name is: " + account.getCustomerName());
        System.out.println("customer's balance is: " + account.getBalance());

        // Test Account's withdraw and deposit
        System.out.println("Info if withdraw 20$: " + account.withdraw(10));
        System.out.println("Info if deposit 1000$: " + account.deposit(1000));
    }
}
