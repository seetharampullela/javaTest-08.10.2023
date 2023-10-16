package dev.lpa;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0,"Amalapuram");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

//        removeElements(placesToVisit);
//        System.out.println(placesToVisit);

//        printItinerary3(placesToVisit);
        testIterator(placesToVisit);
//        getElements(placesToVisit);
    }
    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Hyderabad");
        list.addLast("Vizag");
        //Queue methods
        list.offer("Kakinada");
        list.offerLast("Rajahmundry");
        list.offerFirst("Bheemavaram");
        //Stack Methods
        list.push("Dindi");
    }
    public static void removeElements(LinkedList<String> list) {
        list.remove(3);
        list.remove("Amalapuram");

        System.out.println(list);
        String s1 = list.remove(); // first element is removed
        System.out.println(s1 + " was removed");

        String s2 = list.removeLast();
        System.out.println(s2 + " was removed");
    }

    public static void getElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Kakinada is at position: " + list.indexOf("Kakinada"));
        System.out.println("Kakinada is at position: " + list.lastIndexOf("Kakinada"));

        // Queue retrieval
        System.out.println("Element from element(): " + list.element()); // similar to first emlemen

//        Stack retrieval
        System.out.println("Kakinada is at position: " + list.peek()); // similar to first emlemen
        System.out.println("Kakinada is at position: " + list.peekLast());



    }
    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip Starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(String item: list) {
            System.out.println("---> From: " + previousTown + " to " + item);
            previousTown = item;
        }
        System.out.println("Trip ends at " + list.getLast());
    }
    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip Starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for(int i = 1; i < list.size(); i++) {
            System.out.println("---> From: " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());

    }

    public static void printItinerary3(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator(1);
        String previousTown = list.getFirst();

        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("---> From: " + previousTown + " to " + town);
            previousTown = town;
        }
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while(iterator.hasNext()) {
            if(iterator.next().equals("Bheemavaram")){
                iterator.add("Eluru");
            }
//            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);
    }
}
