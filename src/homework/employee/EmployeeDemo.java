package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRan = true;
        while (isRan) {
            System.out.println("Please input 0 for Exit");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for PRINT ALL EMPLOYEE");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY COMPANY NAME");
            System.out.println("Please input 5 for DELETE EMPLOYEE BY ID");
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
                    String companySearch = scanner.nextLine();
                    employeeStorage.searchByCompanyName(companySearch);
                    break;
                case "5":
                    System.out.println("Please input employeeID");
                    String deleteEmployee=scanner.nextLine();
                    employeeStorage.deleteByEmployeeID(deleteEmployee);
                    break;
                default:
                    System.out.println("Invalid command.Try again!");
            }

        }
    }
}

