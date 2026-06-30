import java.util.*;
class program105
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rollNo;
        String name;
        double marks;
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
        System.out.println("\n----- Student Record -----");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
        sc.close();
    }
}