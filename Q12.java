public class Q12 {
    private String customerName;
    private String accountNumber;
    private double balance;
    private double creditLimit;


    public Q12(String customerName, String accountNumber, double initialBalance, double creditLimit) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.creditLimit = creditLimit;
    }


    public void makePayment(double payment) {
        if (payment <= 0) {
            System.out.println("Invalid payment amount: " + payment);
            return;
        }

        balance -= payment;
        System.out.println("Payment of $" + payment + " made. Remaining balance: $" + balance);
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }


    public static void main(String[] args) {

        CreditCard card = new CreditCard("John Doe", "1234567890", 100.00, 500.00);
        card.makePayment(50.00);
        card.makePayment(-25.00);


        System.out.println("Customer Name: " + card.getCustomerName());
        System.out.println("Account Number: " + card.getAccountNumber());
        System.out.println("Remaining Balance: $" + card.getBalance());
        System.out.println("Credit Limit: $" + card.getCreditLimit());
    }
}

