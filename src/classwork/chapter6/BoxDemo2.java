package classwork.chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 20;
        myBox1.height = 12;
        myBox1.depth = 10;

        myBox2.width = 15;
        myBox2.height = 20;
        myBox2.depth = 16;

        myBox1.volume();
        myBox2.volume();


    }
}
