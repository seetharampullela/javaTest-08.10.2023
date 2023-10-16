public class Main {
    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount();
////        myAccount.setAccountBalance(15000);
////        myAccount.setAccountNumber("10558");
////        myAccount.setCustomerName("Seetharam Pullela");
//        myAccount.getDeposit(500);
//        myAccount.withdraw(10);

        Customer myCustomer = new Customer("Seetharam",
                8500.5,"Seetharam@gmail.com");
        System.out.println(myCustomer.getCreditLimit());
        System.out.println(myCustomer.getEmailAddress());
        System.out.println(myCustomer.getName());

        Customer myCustomer2 = new Customer("Mani","mania@gmail.com");
        System.out.println(myCustomer2.getCreditLimit());
        System.out.println(myCustomer2.getEmailAddress());
        System.out.println(myCustomer2.getName());
    }
}
