package classwork.chapter7;

public class OverloadDemo {
    void test() {
        System.out.println("no argument");
    }

    void test(int a) {
        System.out.println("the only argument is " + a);
    }

    void test(int a, int b) {
        System.out.println("the arguments are " + a + " and " + b);
    }

    double test(double a) {
        System.out.println("double a:" + a);
        return a * a;
    }
}
