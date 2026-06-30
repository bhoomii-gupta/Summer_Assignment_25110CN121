import java.util.*;
class program110
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice, accNo = 0;
        String name = "";
        double balance = 0, amount;
        boolean created = false;
        do
        {
            System.out.println("\n----- Bank Account System -----");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Display Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();
                    created = true;
                    System.out.println("Account Created Successfully.");
                    break;
                case 2:
                    if(created)
                    {
                        System.out.print("Enter Deposit Amount: ");
                        amount = sc.nextDouble();
                        balance = balance + amount;
                        System.out.println("Amount Deposited Successfully.");
                    }
                    else
                    {
                        System.out.println("No Account Found.");
                    }
                    break;
                case 3:
                    if(created)
                    {
                        System.out.print("Enter Withdrawal Amount: ");
                        amount = sc.nextDouble();
                        if(amount <= balance)
                        {
                            balance = balance - amount;
                            System.out.println("Amount Withdrawn Successfully.");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance.");
                        }
                    }
                    else
                    {
                        System.out.println("No Account Found.");
                    }
                    break;
                case 4:
                    if(created)
                    {
                        System.out.println("\n----- Account Details -----");
                        System.out.println("Account Number : " + accNo);
                        System.out.println("Account Holder : " + name);
                        System.out.println("Balance        : " + balance);
                    }
                    else
                    {
                        System.out.println("No Account Found.");
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