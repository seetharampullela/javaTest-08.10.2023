package Telusko.LambdaExpressions;

@FunctionalInterface
interface A {
    void show(int i);
}
// @FunctionalInterface
interface B {
    int add(int i, int j);
}

public class LamdaDemo {
    public static void main(String[] args) {
        A obj = i -> System.out.println("in Show " + i);
        obj.show(5);
// Anonymous Inner Class
        // B obj1 = new B() {
        //     public int add(int i, int j) {
        //         return i+j;
        //     }
        // };
// Functional Interface impl. with Lambda expression

        B obj1 = (int i, int j) -> i + j;
        int result = obj1.add(5, 6);
        System.out.println("result: " + result);
    }
}
