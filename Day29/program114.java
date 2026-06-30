import java.util.*;
class program114
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, choice;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        do
        {
            System.out.println("\n----- Array Operations -----");
            System.out.println("1. Enter Array Elements");
            System.out.println("2. Display Array");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Array Elements:");
                    for(int i=0;i<n;i++)
                    {
                        arr[i]=sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Array Elements:");
                    for(int i=0;i<n;i++)
                    {
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println();
                    break;
                case 3:
                    int max=arr[0];
                    for(int i=1;i<n;i++)
                    {
                        if(arr[i]>max)
                            max=arr[i];
                    }
                    System.out.println("Maximum Element = "+max);
                    break;
                case 4:
                    int min=arr[0];
                    for(int i=1;i<n;i++)
                    {
                        if(arr[i]<min)
                            min=arr[i];
                    }
                    System.out.println("Minimum Element = "+min);
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }while(choice!=5);
        sc.close();
    }
}