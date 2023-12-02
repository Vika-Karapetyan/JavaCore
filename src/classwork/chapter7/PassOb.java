package classwork.chapter7;

public class PassOb {
    public static void main(String[] args) {
        Test ob1=new Test(25,24);
        Test ob2=new Test(5,4);
        Test ob3=new Test(5,4);
        System.out.println("ob2=ob3 is "+ob2.equals(ob3));
        System.out.println("ob1=ob2 is "+ob2.equals(ob1));

    }
}
