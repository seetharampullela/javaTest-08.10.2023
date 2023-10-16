package dev.lpa;

import java.util.Arrays;

public class ReverseChallenge {
    public static void main(String[] args) {
        int[] inputArr = {5,4,3,2,1,0,-1,-2,-3,-4,-5, 20};
        System.out.println(Arrays.toString(inputArr));
        System.out.println(Arrays.toString(reverse((inputArr))));

    }
    private static int[] reverse(int[] array) {
        int length = array.length;
        int[] reverseArr = new int[length];
        for(int i=0; i < length ; i++) {
            reverseArr[i] = array[length-i-1];
        }
        return reverseArr;
    }
}
