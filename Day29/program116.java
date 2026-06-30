import java.util.*;
class program116
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        int itemId = 0;
        String itemName = "";
        int quantity = 0;
        double price = 0;
        boolean added = false;
        do
        {
            System.out.println("\n----- Inventory Management System -----");
            System.out.println("1. Add Item");
            System.out.println("2. Display Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Item ID: ");
                    itemId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Item Name: ");
                    itemName = sc.nextLine();
                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    price = sc.nextDouble();
                    added = true;
                    System.out.println("Item Added Successfully.");
                    break;
                case 2:
                    if(added)
                    {
                        System.out.println("\n----- Item Details -----");
                        System.out.println("Item ID   : " + itemId);
                        System.out.println("Item Name : " + itemName);
                        System.out.println("Quantity  : " + quantity);
                        System.out.println("Price     : " + price);
                    }
                    else
                    {
                        System.out.println("No Item Found.");
                    }
                    break;
                case 3:
                    if(added)
                    {
                        System.out.print("Enter New Quantity: ");
                        quantity = sc.nextInt();
                        System.out.println("Quantity Updated Successfully.");
                    }
                    else
                    {
                        System.out.println("No Item Found.");
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