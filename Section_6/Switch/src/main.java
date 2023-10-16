public class main {
    public static void main(String[] args) {

        int value = 4;
//        switch(value) {
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value was 3, 4 or 5");
//                System.out.println("Value is "+value);
//                break;
//            default:
//                System.out.println("Value was not 2 or 3");
//        }

//        switch(value) {
//            case 2 ->System.out.println("Value was 2");
//            case 3,4,5 -> {
//                System.out.println("Value was 3, 4 or 5");
//                System.out.println("Value is "+value);
//            }
//            default -> System.out.println("Value was not 2 or 3");
//        }
        String natoWord = "Able";
//        System.out.println(getQuarter("Jane"));
//        System.out.println(getNatoChar(natoWord));
//        char natoChar = 'B';
//        getNatoString(natoChar);
        int day = 0;
        printDayOfWeek(day);
        System.out.println(getDaysInMonth(5,2004));
    }
    public static boolean isLeapYear(int year) {
        if(year>=1 || year <= 9999){
            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }else{
                        return false;
                    }
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }
    public static int getDaysInMonth(int month, int year){
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 2: return 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return -1;
        }
    }
    public static String getQuarter(String month){
        // enhanced version of switch
        return switch (month) {
            case "Jan", "Feb", "Mar" -> {
                yield "1st";
            }

            case "Apr", "May", "June" -> "2nd";
            case "Jul", "Aug", "Sep" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4th";
            default -> {
                String badResponse = month + " is not a month";
                yield badResponse;
            }
        };
    }
    public static char getNatoChar(String natoWord){
        switch (natoWord){
            case "Able":
                return 'A';
            case "Baker":
                return 'B';
            case "Charlie":
                return 'C';
            case "Dog":
                return 'D';
            case "Easy":
                return 'E';
            default:
                return 'N';
        }
    }
//    Traditional switch stmt
    public static void getNatoString(char natoChar){
    switch (natoChar){
        case 'A':
            System.out.println("A is Able");
            break;
        case 'B':
            System.out.println("B is Baker");
            break;
        case 'C':
            System.out.println("C is Charlie");
            break;
        case 'D':
            System.out.println("D is Dog");
            break;
        case 'E':
            System.out.println("E is Easy");
            break;
        default:
            System.out.println(natoChar + " is Not Found");
            break;
    }
}
//      Enhanced switch stmt;
    public static void printDayOfWeek(int w){
        String dayOfWeek =  switch(w) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(w + " Stands for " + dayOfWeek);
//        return dayOfWeek;
    }

}
