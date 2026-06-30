import java.util.*;
class program112
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        String name = "", phone = "", email = "";
        boolean added = false;
        do
        {
            System.out.println("\n----- Contact Management System -----");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    phone = sc.nextLine();
                    System.out.print("Enter Email ID: ");
                    email = sc.nextLine();
                    added = true;
                    System.out.println("Contact Added Successfully.");
                    break;
                case 2:
                    if(added)
                    {
                        System.out.println("\n----- Contact Details -----");
                        System.out.println("Name         : " + name);
                        System.out.println("Phone Number : " + phone);
                        System.out.println("Email ID     : " + email);
                    }
                    else
                    {
                        System.out.println("No Contact Found.");
                    }
                    break;
                case 3:
                    if(added)
                    {
                        added = false;
                        name = "";
                        phone = "";
                        email = "";
                        System.out.println("Contact Deleted Successfully.");
                    }
                    else
                    {
                        System.out.println("No Contact Found.");
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