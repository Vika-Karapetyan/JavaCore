package medicalCenter;

import homework.employee.Employee;

import java.text.ParseException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Storage storage=new Storage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for Exit");
            System.out.println("Please input 1 for ADD DOCTOR");
            System.out.println("Please input 2 for SEARCH DOCTOR BY PROFESSION");
            System.out.println("Please input 3 for DELETE DOCTOR BY ID");
            System.out.println("Please input 4 for CHANGE DOCTOR BY ID");
            System.out.println("Please input 5 for ADD PATIENT");
            System.out.println("Please input 6 for PRINT PATIENTS BY DOCTOR");
            System.out.println("Please input 7 for PRINT ALL PATIENTS");
            switch (scanner.nextLine()) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input  Name");
                    String name = scanner.nextLine();
                    System.out.println("Please input  Surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input  ID");
                    String id = scanner.nextLine();
                    System.out.println("Please input  Email");
                    String drEmail = scanner.nextLine();
                    System.out.println("Please input Phone number");
                    String phoneNumber = scanner.nextLine();
                    Doctor doctor = new Doctor(name, surname, id, drEmail, phoneNumber);
                    storage.add(doctor);
                    System.out.println("Done");
                    break;
                case "2":
                    System.out.println("please input profession");
                    String idSearch = scanner.nextLine();
                    storage.searchDoctorByProfession(idSearch);
                    break;
                case "3":
                    System.out.println("please input ID");
                    String deleteDoctor= scanner.nextLine();
                    storage.deleteDoctorByID(deleteDoctor);
                    break;
                case "4":
                    System.out.println("please input ID");
                    break;
                case "5":

                    break;
                case "6":
                    break;
                case "7":
                    break;
            }
        }
    }
}
