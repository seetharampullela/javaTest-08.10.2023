public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++) {
//            Student s = new Student("S28.06.2023-" + i,.
            LPAStudent s = new LPAStudent("S28.06.2023-" + i,
                    switch (i){
                        case 1:
                            yield "Mani";
                        case 2:
                            yield "Sai";
                        case 3:
                            yield "Surya";
                        case 4:
                            yield "Pavan";
                        case 5:
                            yield "Seetharam";
                        default:
                            yield "Anonymous";
                    },
                    "13/12/1995",
                    "Java MasterClass");
            System.out.println(s);
        }
    }
}
