import java.util.*;
class program107
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int empId = 0, choice;
        String empName = "";
        double basicSalary = 0, bonus = 0, totalSalary = 0;
        boolean added = false;
        do
        {
            System.out.println("\n----- Salary Management System -----");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. Display Salary Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();
                    System.out.print("Enter Basic Salary: ");
                    basicSalary = sc.nextDouble();
                    System.out.print("Enter Bonus: ");
                    bonus = sc.nextDouble();
                    totalSalary = basicSalary + bonus;
                    added = true;
                    System.out.println("Salary Record Added Successfully.");
                    break;
                case 2:
                    if(added)
                    {
                        System.out.println("\n----- Salary Details -----");
                        System.out.println("Employee ID  : " + empId);
                        System.out.println("Employee Name: " + empName);
                        System.out.println("Basic Salary : " + basicSalary);
                        System.out.println("Bonus        : " + bonus);
                        System.out.println("Total Salary : " + totalSalary);
                    }
                    else
                    {
                        System.out.println("No salary record found.");
                    }
                    break;
                case 3:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice != 3);
        sc.close();
    }
}