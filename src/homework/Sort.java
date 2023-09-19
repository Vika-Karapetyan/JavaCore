package homework;

public class Sort {
    public void sort(){
        int[] numbers= {1,4,8,5,6,12,21,7};
        for (int i=0;i< numbers.length;i++){
            for (int j=1;j< numbers.length;j++){
                if(numbers[j-1]>numbers[j]){
                    int temp=numbers[j];
                    numbers[j]=numbers[j-1];
                    numbers[j-1]=temp;
                }
            }

        }
        for (int number : numbers) {
            System.out.print(number+" ");

        }

    }
       }
