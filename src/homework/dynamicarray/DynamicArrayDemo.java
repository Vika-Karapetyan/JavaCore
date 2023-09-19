package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray as=new DynamicArray();
        as.add(5);
        as.add(4);
        as.add(15);
        as.print();
        int index=as.getByIndex(5);
        System.out.println(index);


    }
}
