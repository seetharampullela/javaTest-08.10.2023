public class Main {
    public static void main(String[] args) {
        String textBlock = """
                Main line
                    . second line
                        . third line""";
        System.out.println(textBlock);

        for(int i = 1; i <= 10000; i *= 10) {
            System.out.printf("Print %6d %n", i);
        }
        String formattedString = String.format("Your age is %d",35);
        System.out.println(formattedString);
        formattedString = "Your sign is %.2f".formatted(35.0000);
        System.out.println(formattedString);

        printInfo("\t \n");

        System.out.printf("Index of d = %d %n","Hello world".indexOf("ello"));
        String helloWorld = "Hello World";
        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if(helloWorldLower.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if(helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if(helloWorld.contains("ll")) {
            System.out.println("String contains l");
        }
        if(helloWorld.contentEquals(helloWorldLower)){
            System.out.println("String content equals");
        }
    }

    public static void printInfo(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n",length);
        if(string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if(string.isBlank()) {
            System.out.println("String is Blank");

        }
        System.out.printf("First char = %c %n",string.charAt(0));
        System.out.printf("Last char = %c %n",string.charAt(length-1));
    }
}
