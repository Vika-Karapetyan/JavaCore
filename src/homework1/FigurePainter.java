package homework1;

public class FigurePainter {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        //First example


        for (int i = 0; i < 5; i++) {

            for (int j = i; j < 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
        System.out.println();
        //Second Example


        for (int i = 0; i < 5; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
        System.out.println();
        //Third example

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" ");
        //Fourth example



        for (int i = 0; i < 5; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*"+" ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k > i; k--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //Fifth example
    }
}

