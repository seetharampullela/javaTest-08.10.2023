public class Main {
    public static void main(String[] args) {
        Employee seetharam = new Employee("Seetharam", "05/04/1993",
                "01/02/2023");
        System.out.println(seetharam);
        System.out.println("Age = " + seetharam.getAge());
        System.out.println("Pay = " + seetharam.collectPay());

        Employee mani = new Employee("Manikanta", "05/04/1995",
                "01/02/2023");
        System.out.println(mani);
        System.out.println("Age = " + mani.getAge());
        System.out.println("Pay = " + mani.collectPay());

        SalariedEmployee ba = new SalariedEmployee("Ba","05/04/1993",
                "05/04/2005",35000);
        System.out.println(ba);
        System.out.println(ba.collectPay());
        ba.retire();
        System.out.println("Joe' pension " + ba.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary","05/05/1970",
                "03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary paycheck = "+ mary.collectPay());

        System.out.println("Mary holiday pay  "+ mary.getDoublePay());
    }
}
