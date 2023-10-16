public class Hello {
    public static void main(String[] args){
        double a = 20.00;
        double b = 80.00;
        double result = (a+b)*100.00d;
        double rem = result % 40.00d;
        boolean zeroRem = rem == 0?true:false;

        if(zeroRem){
            System.out.println(zeroRem);

        }else{
            System.out.println("got some remainder");

        }
    }
}
