import java.util.*;
class program108
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rollNo = 0, choice;
        String name = "";
        double eng = 0, maths = 0, sci = 0;
        double total = 0, percentage = 0;
        String grade = "";
        boolean added = false;
        do
        {
            System.out.println("\n----- Marksheet Generation System -----");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Marksheet");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    rollNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter English Marks: ");
                    eng = sc.nextDouble();
                    System.out.print("Enter Maths Marks: ");
                    maths = sc.nextDouble();
                    System.out.print("Enter Science Marks: ");
                    sci = sc.nextDouble();
                    total = eng + maths + sci;
                    percentage = total / 3;
                    if(percentage >= 90)
                        grade = "A+";
                    else if(percentage >= 75)
                        grade = "A";
                    else if(percentage >= 60)
                        grade = "B";
                    else if(percentage >= 50)
                        grade = "C";
                    else
                        grade = "Fail";
                    added = true;
                    System.out.println("Marksheet Generated Successfully.");
                    break;
                case 2:
                    if(added)
                    {
                        System.out.println("\n------ MARKSHEET ------");
                        System.out.println("Roll Number : " + rollNo);
                        System.out.println("Name        : " + name);
                        System.out.println("English     : " + eng);
                        System.out.println("Maths       : " + maths);
                        System.out.println("Science     : " + sci);
                        System.out.println("Total       : " + total);
                        System.out.println("Percentage  : " + percentage);
                        System.out.println("Grade       : " + grade);
                    }
                    else
                    {
                        System.out.println("No student record found.");
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