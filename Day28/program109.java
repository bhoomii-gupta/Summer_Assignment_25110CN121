import java.util.*;
class program109
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice, bookId = 0;
        String bookName = "", author = "";
        boolean added = false;
        boolean issued = false;
        do
        {
            System.out.println("\n----- Library Management System -----");
            System.out.println("1. Add Book");
            System.out.println("2. Display Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Book ID: ");
                    bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    bookName = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    author = sc.nextLine();
                    added = true;
                    issued = false;
                    System.out.println("Book Added Successfully.");
                    break;
                case 2:
                    if(added)
                    {
                        System.out.println("\n----- Book Details -----");
                        System.out.println("Book ID     : " + bookId);
                        System.out.println("Book Name   : " + bookName);
                        System.out.println("Author Name : " + author);

                        if(issued)
                            System.out.println("Status      : Issued");
                        else
                            System.out.println("Status      : Available");
                    }
                    else
                    {
                        System.out.println("No Book Record Found.");
                    }
                    break;
                case 3:
                    if(added)
                    {
                        if(!issued)
                        {
                            issued = true;
                            System.out.println("Book Issued Successfully.");
                        }
                        else
                        {
                            System.out.println("Book is Already Issued.");
                        }
                    }
                    else
                    {
                        System.out.println("No Book Available.");
                    }
                    break;
                case 4:
                    if(added)
                    {
                        if(issued)
                        {
                            issued = false;
                            System.out.println("Book Returned Successfully.");
                        }
                        else
                        {
                            System.out.println("Book is Already Available.");
                        }
                    }
                    else
                    {
                        System.out.println("No Book Record Found.");
                    }
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice != 5);
        sc.close();
    }
}