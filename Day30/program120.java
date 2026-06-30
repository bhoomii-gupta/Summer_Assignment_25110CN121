import java.util.*;
class program120
{
    static int roll[] = new int[5];
    static String name[] = new String[5];
    static double marks[] = new double[5];
    static int count = 0;

    static void addStudent(Scanner sc)
    {
        if(count < 5)
        {
            System.out.print("Enter Roll Number: ");
            roll[count] = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            name[count] = sc.nextLine();
            System.out.print("Enter Marks: ");
            marks[count] = sc.nextDouble();
            count++;
            System.out.println("Student Added Successfully.");
        }
        else
        {
            System.out.println("Record is Full.");
        }
    }

    static void displayStudents()
    {
        if(count == 0)
        {
            System.out.println("No Student Record Found.");
            return;
        }
        System.out.println("\n----- Student Records -----");
        for(int i = 0; i < count; i++)
        {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Roll Number : " + roll[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Marks       : " + marks[i]);
        }
    }

    static void searchStudent(Scanner sc)
    {
        if(count == 0)
        {
            System.out.println("No Student Record Found.");
            return;
        }
        System.out.print("Enter Roll Number to Search: ");
        int r = sc.nextInt();
        for(int i = 0; i < count; i++)
        {
            if(roll[i] == r)
            {
                System.out.println("\nStudent Found");
                System.out.println("Roll Number : " + roll[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Marks       : " + marks[i]);
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n----- MINI PROJECT -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent(sc);
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