public class StringOptions {
    public static void main(String[] args) {
        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");
        StringBuilder helloWorldBuilder = new StringBuilder("Hello"+" World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));
        emptyStart.append("abcd".repeat(17));


        printInformation(emptyStart);
        printInformation(emptyStart32);
        helloWorldBuilder.setLength(7);
        System.out.println(helloWorldBuilder);
    }
    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("String length = " + string.length());
    }
    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("StringBuilder length = " + builder.length());
        System.out.println("Capacity = " + builder.capacity());

    }
}
