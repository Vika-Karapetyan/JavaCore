package classwork.chapter7;

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob=new OverloadDemo();
        double result;
        ob.test();
        ob.test(40);
        ob.test(20,50);
        result= ob.test(20.5);
        System.out.println("The result is "+result);
    }
}
