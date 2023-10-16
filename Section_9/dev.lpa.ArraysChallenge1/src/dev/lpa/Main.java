package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        int[] unsortedArray = getIntegers(5);
        System.out.println(Arrays.toString(unsortedArray));
        int lengthOfArray = unsortedArray.length;

        int[] sortedArray = new int[lengthOfArray];
        Arrays.sort(unsortedArray);
        for(int i = 0; i < unsortedArray.length; i++) {
            sortedArray[i] = unsortedArray[lengthOfArray - i -1];
        }
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println(Arrays.toString(sortedArray));

        System.out.println("_".repeat(20));
        String[] splitStrings = "Hello World Again".split(" ");
        printText(splitStrings);
        System.out.println("_".repeat(20));

        printText("Hello","World","Again");
        System.out.println("_".repeat(20));
        String[] sArray = {"First","Second", "Third", "Fouth", "Fifth"};
        System.out.println(String.join(",",sArray));
    }

    public static int[] getRandom(int len) {
        Random random = new Random();
        int[] randomArray = new int[len];
        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }
//    private static int[] sortIntegers(int[] array) {
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        boolean flag = true;
//        int temp;
//        int n = array.length;
//        while(flag) {
//            flag= false;
//            for(int i=0; i < sortedArray.length-1; i++) {
//                if(sortedArray[i] < sortedArray[i+1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray[i+1];
//                    sortedArray[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(sortedArray));
//        return  sortedArray;
//    }


    public static int[] getIntegers(int len) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter " + len + " Elements to form array" );

        int[] randomArray = new int[len];
        for(int i = 0; i < len; i++) {
            randomArray[i] = sc.nextInt();
        }
        return randomArray;
    }
    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        int n = array.length;
        while(flag) {
            flag= false;
            for(int i=0; i < sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        System.out.println(Arrays.toString(sortedArray));
        return  sortedArray;
    }

    public static void printText(String... textList) {
        for(String t : textList) {
            System.out.println(t);
        }
    }
}
