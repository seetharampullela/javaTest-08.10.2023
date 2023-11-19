package Telusko.Enum;


enum Status {
    Running, Failed, Pending, Success;
}
enum Laptop {
    Macbook(2000), XPS(2200), Surface;

    private int price;

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Status s = Status.Pending;

        // Status[] ss = Status.values();
        // for(Status item : ss) {
        //     System.out.println(item + ": "+ item.ordinal());
        // }

        // Status st = Status.Running;

        // System.out.println(s.getClass().getSuperclass());

        // switch (st) {
        //     case Running:
        //         System.out.println("Good");
        //         break;
        //     case Pending:
        //         System.out.println("Please wait");
        //         break;
        //     case Failed:
        //         System.out.println("failed");
        //         break;
        //     default:
        //         System.out.println("Done");
        //         break;
        // }

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + ": " + lap.getPrice());

        for(Laptop item : Laptop.values()){
            System.out.println(item + ": " + item.getPrice());
        }

    }
}
