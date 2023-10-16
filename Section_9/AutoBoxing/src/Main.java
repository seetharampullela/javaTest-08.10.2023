import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK9
        int unboxedInt = boxedInt.intValue();

        // Automatic
         Integer autoBoxed = 15;
         int autoUnboxed = autoBoxed;

        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName()); // getClass won't work on primitive types

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;

        System.out.println(Arrays.toString(wrapperArray));

        Character[] charArray = {'a','b','c','d'};
        System.out.println(Arrays.toString(charArray));

        var outList = getList(1,2,3,4,5);
        System.out.println(outList);


    }

    private static ArrayList<Integer> getList(Integer... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : varargs) {
            aList.add(i);
        }
        return aList;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }
    private static Integer returnAnInteger(int i) {
        return i;
    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }
    private static double getLiteralDoublePrimitive(){
        return 100.0;
    }
}
