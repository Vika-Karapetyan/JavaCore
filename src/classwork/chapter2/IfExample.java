package classwork.chapter2;

public class IfExample {
    public static void main(String[] args) {
        int x,y;
         x = 5;
         y = 10;
        if (x < y) {
            System.out.println("x<у");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x=у");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x>у");
        }
    }
}
