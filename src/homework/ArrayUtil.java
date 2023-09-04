package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {7, 9, 4, 27, 13, -24, -2, 5, -42, 0, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("The first element:" + numbers[0]);

        System.out.println("The last element:" + numbers[numbers.length - 1]);

        System.out.println("Array lenght:" + numbers.length);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.println("Min:" + min);

        if (numbers.length < 2) {
            System.out.println("Can not print middle values");
        } else {
            if (numbers.length % 2 == 0) {
                int middle1 = numbers[numbers.length / 2 - 1];
                int middle2 = numbers[numbers.length / 2];
                System.out.println("Middle numbers:" + middle1 + " and " + middle2);
            } else {
                int middle2 = numbers[numbers.length / 2];
                System.out.println("Middle number:" + middle2);
            }

        }
        int q = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 & numbers[i] != 0) {
                q++;
            }
        }
        System.out.println("Quantity of even numbers:" + q);
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 & numbers[i] != 0) {
                n++;
            }
        }
        System.out.println("Quantity of odd numbers:" + n);

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double p = sum / numbers.length;
        System.out.println("Sum:" + sum);
        System.out.println("Arithmetic average:" + p);


    }
}
