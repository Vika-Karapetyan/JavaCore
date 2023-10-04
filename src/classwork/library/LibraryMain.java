package classwork.library;

import java.util.Scanner;

public class LibraryMain {
   

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BookStorage bookstorage=new BookStorage();

        boolean IsRun=true;

        while (IsRun){
            System.out.println("Please input 0 for Exit");
            System.out.println("Please input 1 for Add Book");
            System.out.println("Please input 2 for Search Book");
            System.out.println("Please input 3 for Print all Books");
            String command=scanner.nextLine();
            switch (command){
                case "0":
                    IsRun=false;
                    break;
                case "1":
                    System.out.println("Please input book title");
                    String title= scanner.nextLine();
                    System.out.println("Please input author name");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input price");
                    double price= Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input count");
                    int count=Integer.parseInt(scanner.nextLine());

                    System.out.println("Book is created");
                    break;
                case "2":
                    System.out.println("Please input keyword");
                    String keyword= scanner.nextLine();
                    break;
                case"3":
                    System.out.println("-----------------------");
                    bookstorage.print();
                    System.out.println("-----------------------");
                    break;
                default:
                    System.out.println("Invalid command.Try again!");

            }
        }


    }
}
