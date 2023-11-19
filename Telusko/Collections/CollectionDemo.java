package Telusko.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(2);
        
        System.out.println(nums);
    }
}
