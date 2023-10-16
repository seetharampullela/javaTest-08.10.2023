public class main {
    public static void main(String[] args) {

//        for (int i = 0; i <=10; i++){
//            System.out.println((i + " is " + (isPrime(i)?"":"NOT ")+"a prime number"));
//        }
        int  count = 0;
//        for (int j = 0; j <= 1000; j++){
//            if(isPrime(j)){
//                System.out.println("Prime numbers " + j);
//                count++;
//                if(count == 3){
//                    break;
//                }
//            }
//        }
        getNumDivisibleby3and5();
//        System.out.println("Number of prime number from 0 to 1000 " + count);
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber/2; divisor++){
            if(wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }

    public static void getNumDivisibleby3and5() {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is divisible by 3 and 5");
                sum += i;
                count++;
                if(count == 5){
                    System.out.println("Found first 5 numbers - exit the loop");
                    break;
                }
            }
        }
        System.out.println("Sum of first 5 num divisible by 3 and 5 is "+ sum);
    }

}
