import java.util.*;
class program111
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice, ticketNo = 0;
        String passengerName = "", destination = "";
        boolean booked = false;
        do
        {
            System.out.println("\n----- Ticket Booking System -----");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Ticket Number: ");
                    ticketNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    passengerName = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    destination = sc.nextLine();
                    booked = true;
                    System.out.println("Ticket Booked Successfully.");
                    break;
                case 2:
                    if(booked)
                    {
                        booked = false;
                        System.out.println("Ticket Cancelled Successfully.");
                    }
                    else
                    {
                        System.out.println("No Ticket Booked.");
                    }
                    break;
                case 3:
                    if(booked)
                    {
                        System.out.println("\n----- Ticket Details -----");
                        System.out.println("Ticket Number   : " + ticketNo);
                        System.out.println("Passenger Name  : " + passengerName);
                        System.out.println("Destination     : " + destination);
                        System.out.println("Status          : Booked");
                    }
                    else
                    {
                        System.out.println("No Ticket Booked.");
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