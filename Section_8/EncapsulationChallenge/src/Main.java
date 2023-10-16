public class Main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer(50, true);

        System.out.println("Initial page count = " + myPrinter.getPagesPrinted());
        System.out.println(myPrinter.printPages(1));
        int printedPages = myPrinter.printPages(5);

        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                printedPages,myPrinter.getPagesPrinted());

        printedPages = myPrinter.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                printedPages,myPrinter.getPagesPrinted());
    }
}
