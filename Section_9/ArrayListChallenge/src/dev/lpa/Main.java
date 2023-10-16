package dev.lpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = {"apples","bananas","milk"};
        List<String> list = List.of(items);

        ArrayList<String> groceryList = new ArrayList<>(list);

        while(true) {
            System.out.println("Enter actionKey: ");
            int actionKey = Integer.parseInt(sc.nextLine());
            if(actionKey == 0) {
                System.out.println(groceryList);
                break;
            }
            System.out.println("Now Enter Grocery item: ");
            String groceryItems = sc.nextLine();
            String[] arr = groceryItems.split(",");

            if (actionKey == 1) {
                for(int i = 0; i < arr.length; i++) {
                    if (groceryList.contains(arr[i])) {
                        System.out.println(arr[i] + " already exist in groceryList");
                    } else {
                        groceryList.add(arr[i]);
                    }
                }
            } else if (actionKey == 2) {
                for(int i = 0; i < arr.length; i++) {
                    if (groceryList.contains(arr[i])) {
                        groceryList.remove(arr[i]);

                    } else {
                        System.out.println(arr[i]
                                + " does not exist in groceryList");
                    }
                }

            }
        }
    }
}
