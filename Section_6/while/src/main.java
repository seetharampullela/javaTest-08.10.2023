public class main {
    public static void main(String[] args) {
        int j = 0;
//        while(j <= 5){
//            System.out.println(j);
//            j++;
//        }
//        while(true){
//            if(j==5){
//                break;
//            }
////            System.out.println(j);
//            j++;
//        }
//        boolean isReady = false;
//        do {
//            if(j>5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//        } while (isReady);

//        int number = 0;
//        while (number < 50) {
//            number += 5;
//            if(number%25 == 0){
//                continue;
//            }
//            System.out.print(number + "_");
//        }

        int k = 4;
        int end = 20;
        int evenCount = 0;
        int oddCount = 0;
//        while (k <= end){
//            k++;
//            if(!isEvenNumber(k)){
//                oddCount++;
//                continue;
//            }
//            evenCount++;
//            System.out.println(k);
//            if(evenCount >= 5){
//                break;
//            }
//        }
//        System.out.println("Number of Even numbers " + evenCount);
//        System.out.println("Number of Odd numbers " + oddCount);
        int n = 3241;
        System.out.println("Sum of digits in number " + n+ " is " + sumDigits(n));
    }
    public static boolean isEvenNumber(int num){

        if(num % 2 == 0){
            return true;
        }
        return false;
    }

    public static int sumDigits(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
//        while(number > 0){
//            sum += number %10;
//            number = number/10;
//        }

        while(number > 9){
            sum += number %10;
            number = number/10;
        }
        sum += number % 10;

        return sum;
    }
}
