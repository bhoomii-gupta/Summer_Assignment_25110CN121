import java.util.*;
class program119
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[5];
        String name[] = new String[5];
        double salary[] = new double[5];
        int count = 0, choice;
        do
        {
            System.out.println("\n----- MINI EMPLOYEE MANAGEMENT SYSTEM -----");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    if(count < 5)
                    {
                        System.out.print("Enter Employee ID: ");
                        id[count] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        name[count] = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();
                        count++;
                        System.out.println("Employee Added Successfully.");
                    }
                    else
                    {
                        System.out.println("Employee List is Full.");
                    }
                    break;
                case 2:
                    if(count == 0)
                    {
                        System.out.println("No Employee Records Found.");
                    }
                    else
                    {
                        System.out.println("\n----- Employee Details -----");
                        for(int i = 0; i < count; i++)
                        {
                            System.out.println("\nEmployee " + (i + 1));
                            System.out.println("Employee ID   : " + id[i]);
                            System.out.println("Employee Name : " + name[i]);
                            System.out.println("Salary        : " + salary[i]);
                        }
                    }
                    break;
                case 3:
                    if(count == 0)
                    {
                        System.out.println("No Employee Records Found.");
                    }
                    else
                    {
                        System.out.print("Enter Employee ID to Search: ");
                        int searchId = sc.nextInt();
                        boolean found = false;
                        for(int i = 0; i < count; i++)
                        {
                            if(id[i] == searchId)
                            {
                                System.out.println("\nEmployee Found");
                                System.out.println("Employee ID   : " + id[i]);
                                System.out.println("Employee Name : " + name[i]);
                                System.out.println("Salary        : " + salary[i]);
                                found = true;
                                break;
                            }
                        }
                        if(!found)
                        {
                            System.out.println("Employee Not Found.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice != 4);
        sc.close();
    }
}