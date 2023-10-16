import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int currentYear = 2023;
        String dob = "1999";
//        try {
//            System.out.println(getSumOfFiveInputNumbers(currentYear));
//        }catch(NullPointerException e){
//            System.out.println((e));
//            System.out.println(getInputFromScanner(currentYear));
//        }
//        System.out.println(getSumOfFiveInputNumbers());
//        System.out.println(getMinAndMax());
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int j = 0;
        int summ = 0;
        boolean valid = true;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                String number = scanner.nextLine();
                j++;
                summ += Integer.parseInt(number);
            }catch(NumberFormatException nfe) {
                j = -1;
                valid = false;
                break;
            }
        }while (j >= 0);
        if(j == -1 ){
            System.out.println("SUM = 0 AVG = 0");
        }
        System.out.println("SUM = " + summ + " Average = "+ summ/j);
    }
//    >>>>>>>>>>>> Max and min challenge 74 <<<<<<<<
    public static String getMinAndMax(){
    int i = 1;
    boolean isValid = true;

    double maxNum = 0;
    double minNum = 0;

    do{
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number #" + i);
            String number = scanner.nextLine();
            i++;
            double validNum = Double.parseDouble(number);
            maxNum = validNum > maxNum ?
                    validNum : maxNum;
            minNum = validNum < minNum ?
                    validNum : minNum;

        }catch(NumberFormatException nfe){
            isValid = false;
//            System.out.println("Invalid input, Characters are not allowed");
        }
    }while(isValid);
    return ("Minimum of all entries: "+ minNum +
            " \nMaximum of all entries: " + maxNum);
}

//    >>>>>>>>>>>> challenge in lesson 73  <<<<<<<<<<<<
    public static double getSumOfFiveInputNumbers(){
        int i = 1;
        double result = 0;
        do{
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number #" + i);
                String number = scanner.nextLine();
//                result += Integer.parseInt(number);
                result += Double.parseDouble(number);
                i++;
            }catch(NumberFormatException badUserData){
                System.out.println("Invalid input, Characters are not allowed");
            }
        }while(i <= 5);
        return result;
    }



// >>>>>> Class <<<<<<<
//    public static String getInputFromConsole(int currentYear){
//        String name = System.console().readLine("Hi, What is your name? ");
//        System.out.println("Hi "+name+ ", Thanks for having us!");
//        return "";
//    }
//    public static String getInputFromScanner(int currentYear){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hi, What is your name? ");
//        String name = scanner.nextLine();
//
//        System.out.println("Hi "+name+ ", Thanks for having us!");
//        System.out.println("What year were you born? ");
//
//        boolean validDOB = false;
//        int age = 0;
//
//        do{
//            System.out.println("Enter a year of birth ?= " +
//                    (currentYear - 125) + " and <= "+(currentYear));
//            try{
//                age = checkData(currentYear, scanner.nextLine());
//                validDOB = age < 0 ? false : true;
//            }catch (NumberFormatException badUserData) {
//                System.out.println("Characters are not allowed");
//            }
//        }while(!validDOB);
//        return "So you are " + age + " years old";
//    }
//
//    public static int checkData(int currentYear, String dateOfBirth) {
//        int dob = Integer.parseInt(dateOfBirth);
//        int minimumYear = currentYear - 125;
//
//        if((dob < minimumYear) || (dob > currentYear)) {
//            return -1;
//        }
//        return (currentYear - dob);
//    }

}
