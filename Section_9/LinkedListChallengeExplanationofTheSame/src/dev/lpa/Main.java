package dev.lpa;

import java.util.*;

record Place(String name, int distance){
    @Override
    public String toString() {
        return String.format("%s (%d)",name, distance);
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Place("adelaide", 1374)); // Duplicate case
        addPlace(placesToVisit, new Place("Sydney", 0));
        addPlace(placesToVisit, new Place("Alice Springs",2771));
        addPlace(placesToVisit, new Place("Brisbane",917));
        addPlace(placesToVisit, new Place("Darwin",3972));
        addPlace(placesToVisit, new Place("Melbourne",877));
        addPlace(placesToVisit, new Place("Perth",3923));

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        menuOptions();

        while(!quitLoop) {


            if(!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if(!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0,1);

            switch (menuItem) {
                case "F":
                    System.out.println("User Wants to go forward");
                    if(!forward) { //Reversion
                        forward = true;
                        if(iterator.hasNext()){
                            iterator.next(); //Adjusting position
                        }
                    }
                    if(iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    break;
                case "B":
                    System.out.println("User Wants to go backward");
                    if(forward) { //Reversion
                        forward = false;
                        if(iterator.hasPrevious()){
                            iterator.previous(); //Adjusting position
                        }
                    }
                    if(iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "M":
                    menuOptions();
                    break;
                case "L":
                    printItinerary(placesToVisit);
                    break;
                default:
                    quitLoop = true;
                    break;
            }
        }
    }
    public static void addPlace(LinkedList<Place> list, Place place) {
        if(list.contains(place)){
            System.out.println("Found duplicate: " + place);
            return;
        }
        for(Place p : list ) {
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        int matchedIndex = 0;

        for(var listPlace: list) {
            if(place.distance() < listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;

        }
        list.add(place);
    }
    public static void menuOptions() {
        System.out.println("""
               Available actions (select word or letter):
               (F)orward
               (B)ackward
               (L)ist Places
               (M)enu
               (Q)uit
                """);
    }


    public static void goForward(LinkedList<Place> list) {
        System.out.println("Please enter Place name and distance in " +
                "comma separated way");
        Scanner sc = new Scanner(System.in);
        String[] inTown = sc.next().split(",");
        Place place = new Place(inTown[0], Integer.parseInt((inTown[1])));
        addPlace(list, place);
        printItinerary(list);
    }
    public static void goBackward(LinkedList<Place> list) {
//        addPlace(list, place);
    }

    public static void printItinerary(LinkedList<Place> list) {
        System.out.println("Trip starts at " + list.getFirst().name());
        Place previousTown = list.getFirst();
        ListIterator<Place> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown.name() + " to "
                    + town.name() + " At a " + town.distance());
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast().name());
    }
}
