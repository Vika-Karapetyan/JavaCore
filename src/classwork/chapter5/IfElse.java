package classwork.chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 3;
        String season;
        if (month == 1 || month == 2 || month == 12) {
            season = "winter";
        }
        else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        }
        else if(month==6 || month==7 || month==8){
            season="summer";
        }
        else if(month==9 || month==10 || month==11){
            season="autumn";
        }
        else
            season="does not exist";
        System.out.println("May is in " + season + ".");
    }
}
