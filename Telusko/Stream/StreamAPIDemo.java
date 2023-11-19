package Telusko.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPIDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

        // for(int i = 0; i < nums.size(); i++) {
        //     System.out.println(nums.get(i));
        // }

        // for(int i: nums){
        //     System.out.println(i);
        // }
/* conventional approach to print elements in an array!!! */
        // nums.forEach(n -> System.out.println(n));
/* with stream */
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int result = s3.reduce(0, (c,e)->c+e);
        // System.out.println(result);   
        // s3.forEach(n -> System.out.println(n));        
/* Simplified Stream */
        // Predicate<Integer> p = new Predicate<Integer>() {
        //     @Override
        //     public boolean test(Integer n) {
        //         if(n % 2 == 0) return true;
        //         else return false;
        //     }
        // };
        // Predicate<Integer> p = n ->  n%2==0;
        // int res = nums.stream()
        //             .filter(n -> n%2==0)
        //             .map(n -> n*2)
        //             .reduce(0,(c,e)->c+e);
        // System.out.println(res);


        Stream<Integer> sorterRes = nums.stream()
                    .filter(n -> n%2==0)
                    .sorted();
        sorterRes.forEach(n->System.out.println(n));

        // int sum = 0;
        // for(int n: nums)
        // {
        //     if(n%2 == 0) {
        //         n = n*2;
        //         sum = sum +n;
        //     }
        // }
        // System.out.println(sum);
    }
}
