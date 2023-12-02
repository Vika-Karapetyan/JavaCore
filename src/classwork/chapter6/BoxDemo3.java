package classwork.chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
       Box myBox1=new Box();
       Box myBox2=new Box();
       double vol;
       myBox1.SetDim(10,20,30);
       myBox2.SetDim(15,14,9);
       vol= myBox1.volume();
        System.out.println("The volume of first box equals "+vol);
        vol= myBox2.volume();
        System.out.println("The volume of second box equals "+vol);
    }
}
