package Telusko.Threads;

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}

class A implements Runnable{
    public void run() {
        for(int i = 1; i <=5; i++) {
            System.out.println("Hi");
            try {
               /* .sleep method will nake the Thread (with runnable interface),
                to wait for other task to execute. in this case A implements Runnable  */
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for(int i = 1; i <=5; i++) {
            System.out.println("Hello");
            try {
                /* .sleep method will nake the Thread (with runnable interface),
                to wait for other task to execute. in this case A implements 
                Runnable  */
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // System.out.println(obj1.getPriority());
        // obj1.setPriority(Thread.MAX_PRIORITY); // Setting the priority of a thread

        Thread t1 = new Thread(obj1);        
        Thread t2 = new Thread(obj2);

        // Running multiple threads at a time simultaneously
        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Hi");
        }
        t2.start();

        Counter z = new Counter();
        Runnable obj3 = () -> {
            for(int i = 1; i<=10000; i++) {
                z.increment();
            }
        };

        Runnable obj4 = () -> {
            for(int i = 1; i<=10000; i++) {
                z.increment();
            }
        };

        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(z.count);

        
    }
}
