package homework.dynamicarray;

import javax.swing.*;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;


    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {
        if (size == array.length - 1) {
            extend();
            array[size++] = value;
        }
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] newarray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
        }
        array = newarray;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            return -1;
        }
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void deleteByIndex(int index) {
        if (index >= 0 || index > array.length - 1)
            for (int i = index; i < array.length; i++) {
                array[i] = array[i + 1];
            }
        else {
            System.out.println("Element with this index does not exist");
        }
        size--;
    }

    public void set(int index, int value) {
        if (index >= 0 || index > array.length - 1) {
            array[index] = value;
        } else {
            System.out.println("Element with this index does not exist");
        }
    }

    public void add(int index, int value) {
        if (index >= 0 || index > array.length - 1){
            array[index]=value;
        }
        else{
            System.out.println("Element with this index does not exist");
        }
        for(int i=index;i<size;i++){
            array[i+1]=array[i];
        }
    }

    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if(array [i] ==value){
                return true;
            }
        }
        return false;
    }
    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }


}
