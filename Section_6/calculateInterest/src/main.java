public class main {
    public static void main(String[] args) {
        for(double rate = 7.5; rate<=10; rate += 0.25){
            double interestAmount = calculateInterese(rate, 10000);
            System.out.println("10,000 at "+rate+"% interest = "+interestAmount);
        }
    }
    public static double calculateInterese(double interestRate, double amount){
        return (amount * (interestRate/100));
    }
}
