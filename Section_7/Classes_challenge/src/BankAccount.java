public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount() {
        this("123", 55.0, "Default Name"); //constructor called with in another constructor
        System.out.println("Empty constructor called,,");
    }
    public BankAccount(String number, double balance, String customerName) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.accountBalance = balance;
        this.customerName = customerName;
    }

    public BankAccount(String customerName, String email, long phoneNumber) {
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void getDeposit(double deposit) {
        accountBalance += deposit;
        System.out.println("Your account is credited with : $"
                + deposit);
        System.out.println("Your current available balance is : $"
                + (this.accountBalance));
    }

    public void withdraw(double amount) {
        accountBalance -= amount;
        if (accountBalance < 0) System.out.println("Sorry, your account balance is insufficient");
        else {
            System.out.println("Your account debited by: $" + amount);
            System.out.println("Your current available balance is : $"
                    + (this.accountBalance));
        }

    }


}
