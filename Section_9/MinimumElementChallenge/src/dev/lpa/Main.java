package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] intArray = readIntegers();
        System.out.println(findMin(intArray));
    }
    private static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Input: ");
        String blah = sc.nextLine();
        String[] input = blah.split(",");
        int[] convertedArr = new int[input.length];
        System.out.println(input.length);
        for(int i = 0; i < input.length; i++) {
            convertedArr[i] = Integer.valueOf(input[i].trim());
        }

        System.out.println(Arrays.toString(input));
        return convertedArr;


    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for(int i: arr) {
            if(i < min) {
                min = i;
            }
        }
//        Arrays.sort(arr);
        int result = arr[0];
        return min;
    }
}
