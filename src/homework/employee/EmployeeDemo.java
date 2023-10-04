package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRan = true;
        while (isRan) {
            System.out.println("Please input 0 for Exit");
            System.out.println("Please input 1 ADD EMPLOYEE");
            System.out.println("Please input 2 PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("Please input 4 SEARCH EMPLOYEE BY COMPANY NAME");
            switch (scanner.nextLine()) {
                case "0":
                    isRan = false;
                    break;
                case "1":
                    System.out.println("Please input  Name");
                    String name = scanner.nextLine();
                    System.out.println("Please input  Surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input  EmployeeID");
                    String emplyeeID = scanner.nextLine();
                    System.out.println("Please input  Salary");
                    int salary = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input Company");
                    String company = scanner.nextLine();
                    System.out.println("Please input  Position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, emplyeeID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Done");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employeeID");
                    String idSearch = scanner.nextLine();
                    employeeStorage.searchByEmployeeID(idSearch);
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String positionSearch = scanner.nextLine();
                    employeeStorage.searchByCompanyName(positionSearch);
                    break;
                default:
                    System.out.println("Invalid command.Try again!");
            }

        }
    }
}

