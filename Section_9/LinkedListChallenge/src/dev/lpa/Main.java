package dev.lpa;

import java.util.*;

//record TownType(String name, long distance) {}

public class Main {
    public static void main(String[] args) {
//        LinkedList<TownType> list = new LinkedList<TownType>();

        LinkedList<TownType> placesToVisit = new LinkedList<>();

//        var placesToVisit = new LinkedList<TownType>();
        menuOptions(placesToVisit);
    }
    public static void addTown(LinkedList<TownType> list, TownType town) {
        var town0 = new TownType("Sydney",0);
        var town1 = new TownType("Adelaide",1374);
        var town2 =  new TownType("Alice Springs",2771);
        var town3 = createTown("Brisbane",917);
        var town4 = createTown("Darwin",3972);
        var town5 = createTown("Melbourne",877);
        var town6 = createTown("Perth",3923);
//        list.addAll(town1, town2, town3, town4, town5, town6);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        if(list.contains(town)) {
            System.out.println("Found Duplicate " + town);
        }

        list.add(town0);
        list.add(town1);
        list.add(town2);
        list.add(town3);
        list.add(town4);
        list.add(town5);
        list.add(town6);
        list.add(town);
    }

    public static TownType createTown(String name, long distance) {
        var town = new TownType(name, distance);
        return town;
    }


    public static void menuOptions(LinkedList<TownType> list) {

        System.out.println("""
               Available actions (select word or letter):
               (F)orward
               (B)ackward
               (L)ist Places
               (M)enu
               (Q)uit
                """);

        Scanner sc = new Scanner(System.in);
        String menuAction = sc.nextLine();
        String[] inTown = sc.next().split(",");
        System.out.println("Please enter Place name and distance in " +
                "comma separated way");
        TownType town = new TownType(inTown[0], Integer.parseInt((inTown[1])));

        switch (menuAction) {
            case "F" -> {
                goForward(list,town);
            }
            default -> System.out.println("Quit");
        }

    }


    public static void goForward(LinkedList<TownType> list, TownType town) {
//        orderList(list);
        addTown(list, town);
        printItinerary(list);
    }

    public static void orderList(LinkedList<TownType> list) {
        ArrayList<Long> dist = new ArrayList<>();
        for(int i = 1; i < list.size(); i++) {
            int j = i-1;

            long currDistance = list.get(i).getDistance();
            long prevDistance = list.get(j).getDistance();

            dist.add(currDistance);

//            while (j != 0 && prevDistance < currDistance) {
//                System.out.println(currDistance + " , " + prevDistance);
//                list.set(j+1, list.get(j));
//                j = j -1;
//            }
//            list.set(j+1, list.get(i));


        }
        dist.sort(Comparator.naturalOrder());
        System.out.println(dist);

        ListIterator<TownType> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            var index = 0;
            for(int i = 0; i < dist.size(); i++) {
                if(town.getDistance() == dist.get(i)) {
                    index = list.indexOf(town);
                    list.set(index, list.get(i));
                }
//                list.set(i, list.get(index));
            }

        }
    }
    public static void printItinerary(LinkedList<TownType> list) {
        System.out.println("Trip starts at " + list.getFirst().getName());
        TownType previousTown = list.getFirst();
        ListIterator<TownType> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            var town = iterator.next();
//            System.out.println("--> From: " + previousTown.getName() + " to "
//                    + town.getName() + " At a ");
            System.out.println("Town: " + town.getName() + " at a distance of "
                    + town.getDistance());
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast().getName());
    }


}
