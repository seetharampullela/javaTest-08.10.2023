public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int startInd = birthDate.indexOf("1982");
        System.out.println("Start index = "+startInd);
        System.out.println("Birth year = " + birthDate.substring(startInd));

        String newDate = String.join("/","25","11","1982");
        System.out.println("newDate = " + newDate);
        System.out.println("Month = "+birthDate.substring(3, 5));
        System.out.println(newDate.replaceAll("/","{}"));
        System.out.println(newDate.replaceFirst("/","{}"));
        System.out.println(newDate.replace("/","{}"));
        System.out.println("ABC\n".repeat(5));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

    }
}
