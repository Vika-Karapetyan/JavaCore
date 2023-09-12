package classwork.chapter5;

public class SwitchExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            switch (i) {
                case 0:
                    System.out.println("i is equal to zero.");
                    break;
                case 1:
                    System.out.println("i equal to one.");
                    break;
                case 2:
                    System.out.println("i is equal to two.");
                    break;
                case 3:
                    System.out.println("i is equal to three.");
                    break;
                default:
                    System.out.println("i is greater than three.");
            }
    }
}
