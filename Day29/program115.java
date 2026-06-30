import java.util.*;
class program115
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        String str = "";
        boolean entered = false;
        do
        {
            System.out.println("\n----- String Operations -----");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter a String: ");
                    str = sc.nextLine();
                    entered = true;
                    break;
                case 2:
                    if(entered)
                        System.out.println("String = " + str);
                    else
                        System.out.println("No String Entered.");
                    break;
                case 3:
                    if(entered)
                        System.out.println("Length = " + str.length());
                    else
                        System.out.println("No String Entered.");
                    break;
                case 4:
                    if(entered)
                        System.out.println("Uppercase = " + str.toUpperCase());
                    else
                        System.out.println("No String Entered.");
                    break;
                case 5:
                    if(entered)
                        System.out.println("Lowercase = " + str.toLowerCase());
                    else
                        System.out.println("No String Entered.");
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice != 6);
        sc.close();
    }
}